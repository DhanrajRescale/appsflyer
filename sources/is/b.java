package is;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.exceptions.InvalidFrameException;
import java.nio.ByteBuffer;
import okhttp3.HttpUrl;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes2.dex */
public final class b extends e implements a {

    /* renamed from: g, reason: collision with root package name */
    public static final ByteBuffer f20522g = ByteBuffer.allocate(0);

    /* renamed from: e, reason: collision with root package name */
    public int f20523e;

    /* renamed from: f, reason: collision with root package name */
    public String f20524f;

    @Override // is.e, is.d
    public final ByteBuffer a() {
        return this.f20523e == 1005 ? f20522g : this.f20528c;
    }

    @Override // is.e, is.c
    public final void b(ByteBuffer byteBuffer) {
        this.f20528c = byteBuffer;
        this.f20523e = WebSocketProtocol.CLOSE_NO_STATUS_CODE;
        byteBuffer.mark();
        if (byteBuffer.remaining() >= 2) {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.position(2);
            allocate.putShort(byteBuffer.getShort());
            allocate.position(0);
            int i10 = allocate.getInt();
            this.f20523e = i10;
            if (i10 == 1006 || i10 == 1015 || i10 == 1005 || i10 > 4999 || i10 < 1000 || i10 == 1004) {
                throw new InvalidFrameException("closecode must not be sent over the wire: " + this.f20523e);
            }
        }
        byteBuffer.reset();
        if (this.f20523e == 1005) {
            this.f20524f = ks.b.a(this.f20528c);
            return;
        }
        ByteBuffer byteBuffer2 = this.f20528c;
        int position = byteBuffer2.position();
        try {
            try {
                byteBuffer2.position(byteBuffer2.position() + 2);
                this.f20524f = ks.b.a(byteBuffer2);
            } catch (IllegalArgumentException e10) {
                throw new InvalidDataException(CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE, e10);
            }
        } finally {
            byteBuffer2.position(position);
        }
    }

    public final void c(int i10, String str) {
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (i10 == 1015) {
            i10 = 1005;
        } else {
            str2 = str;
        }
        if (i10 == 1005) {
            if (str2.length() <= 0) {
                return;
            } else {
                throw new InvalidDataException(CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE, "A close frame must have a closecode if it has a reason");
            }
        }
        byte[] b10 = ks.b.b(str2);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i10);
        allocate.position(2);
        ByteBuffer allocate2 = ByteBuffer.allocate(b10.length + 2);
        allocate2.put(allocate);
        allocate2.put(b10);
        allocate2.rewind();
        b(allocate2);
    }

    @Override // is.e
    public final String toString() {
        return super.toString() + "code: " + this.f20523e;
    }
}
