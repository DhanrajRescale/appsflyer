package os;

import com.mixpanel.android.java_websocket.exceptions.NotSendableException;
import com.mixpanel.android.java_websocket.exceptions.WebsocketNotConnectedException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30328a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30329b;

    public /* synthetic */ h(Object obj, int i10) {
        this.f30328a = i10;
        this.f30329b = obj;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f30328a) {
            case 0:
                try {
                    ((i) this.f30329b).f30332b.v0(i.f30330d, true);
                    return;
                } catch (NotSendableException e10) {
                    throw new IOException(e10.getMessage());
                } catch (WebsocketNotConnectedException e11) {
                    throw new IOException(e11.getMessage());
                }
            default:
                return;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        switch (this.f30328a) {
            case 1:
                return;
            default:
                super.flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f30328a) {
            case 1:
                return ((bv.j) this.f30329b) + ".outputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] data, int i10, int i11) {
        int i12 = this.f30328a;
        Object obj = this.f30329b;
        switch (i12) {
            case 0:
                try {
                    ((i) obj).f30332b.v0(ByteBuffer.wrap(data, i10, i11), false);
                    return;
                } catch (NotSendableException e10) {
                    throw new IOException(e10.getMessage());
                } catch (WebsocketNotConnectedException e11) {
                    throw new IOException(e11.getMessage());
                }
            default:
                Intrinsics.checkNotNullParameter(data, "data");
                ((bv.j) obj).X(data, i10, i11);
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar) {
        this(iVar, 0);
        this.f30328a = 0;
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        switch (this.f30328a) {
            case 0:
                write(new byte[]{(byte) i10}, 0, 1);
                return;
            default:
                ((bv.j) this.f30329b).b0(i10);
                return;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        switch (this.f30328a) {
            case 0:
                write(bArr, 0, bArr.length);
                return;
            default:
                super.write(bArr);
                return;
        }
    }
}
