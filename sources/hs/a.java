package hs;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.mixpanel.android.java_websocket.exceptions.IncompleteHandshakeException;
import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException;
import h.b0;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.CodingErrorAction;
import java.util.List;
import java.util.Locale;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f18694c = ks.b.b("<policy-file-request/>\u0000");

    /* renamed from: a, reason: collision with root package name */
    public int f18695a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f18696b = 0;

    public static boolean c(js.e eVar) {
        b0 b0Var = (b0) eVar;
        if (b0Var.d("Upgrade").equalsIgnoreCase("websocket") && b0Var.d("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade")) {
            return true;
        }
        return false;
    }

    public static void d(int i10) {
        if (i10 >= 0) {
        } else {
            throw new InvalidDataException(CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE, "Negative count");
        }
    }

    public static String h(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        byte b10 = 48;
        while (true) {
            if (byteBuffer.hasRemaining()) {
                byte b11 = byteBuffer.get();
                allocate.put(b11);
                if (b10 == 13 && b11 == 10) {
                    allocate.limit(allocate.position() - 2);
                    allocate.position(0);
                    break;
                }
                b10 = b11;
            } else {
                byteBuffer.position(byteBuffer.position() - allocate.position());
                allocate = null;
                break;
            }
        }
        if (allocate == null) {
            return null;
        }
        byte[] array = allocate.array();
        int limit = allocate.limit();
        CodingErrorAction codingErrorAction = ks.b.f23483a;
        try {
            return new String(array, 0, limit, "ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX WARN: Type inference failed for: r7v6, types: [h.b0, js.d] */
    public static b0 l(ByteBuffer byteBuffer, int i10) {
        js.c cVar;
        String h10 = h(byteBuffer);
        if (h10 != null) {
            String[] split = h10.split(" ", 3);
            if (split.length == 3) {
                if (i10 == 1) {
                    ?? b0Var = new b0();
                    Short.parseShort(split[1]);
                    b0Var.f21657c = split[2];
                    cVar = b0Var;
                } else {
                    js.c cVar2 = new js.c();
                    String str = split[1];
                    if (str != null) {
                        cVar2.f21656c = str;
                        cVar = cVar2;
                    } else {
                        throw new IllegalArgumentException("http resource descriptor must not be null");
                    }
                }
                String h11 = h(byteBuffer);
                while (h11 != null && h11.length() > 0) {
                    String[] split2 = h11.split(":", 2);
                    if (split2.length == 2) {
                        cVar.h(split2[0], split2[1].replaceFirst("^ +", HttpUrl.FRAGMENT_ENCODE_SET));
                        h11 = h(byteBuffer);
                    } else {
                        throw new InvalidHandshakeException("not an http header");
                    }
                }
                if (h11 != null) {
                    return cVar;
                }
                throw new IncompleteHandshakeException();
            }
            throw new InvalidHandshakeException();
        }
        throw new IncompleteHandshakeException(byteBuffer.capacity() + 128);
    }

    public abstract int a(js.a aVar, js.f fVar);

    public abstract int b(js.a aVar);

    public abstract ByteBuffer e(is.d dVar);

    public abstract int f();

    public abstract js.a g(js.c cVar);

    public abstract void i();

    public abstract List j(ByteBuffer byteBuffer);

    public b0 k(ByteBuffer byteBuffer) {
        return l(byteBuffer, this.f18695a);
    }
}
