package iv;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class f extends e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final f f20561a = new e();
    private static final long serialVersionUID = -1440403870442975015L;

    public static boolean b(long j10) {
        if ((3 & j10) == 0 && (j10 % 100 != 0 || j10 % 400 == 0)) {
            return true;
        }
        return false;
    }

    private Object readResolve() {
        return f20561a;
    }
}
