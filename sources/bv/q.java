package bv;

import java.io.FileNotFoundException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final x f7389a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [bv.x] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    static {
        ?? r02;
        try {
            Class.forName("java.nio.file.Files");
            r02 = new Object();
        } catch (ClassNotFoundException unused) {
            r02 = new Object();
        }
        f7389a = r02;
        String str = b0.f7323b;
        String property = System.getProperty("java.io.tmpdir");
        Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
        gt.d.f(property, false);
        ClassLoader classLoader = cv.f.class.getClassLoader();
        Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
        new cv.f(classLoader);
    }

    public abstract i0 a(b0 b0Var);

    public abstract void b(b0 b0Var, b0 b0Var2);

    public abstract void c(b0 b0Var);

    public abstract void d(b0 b0Var);

    public final void e(b0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        d(path);
    }

    public final boolean f(b0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        if (i(path) != null) {
            return true;
        }
        return false;
    }

    public abstract List g(b0 b0Var);

    public final p h(b0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        p i10 = i(path);
        if (i10 != null) {
            return i10;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    public abstract p i(b0 b0Var);

    public abstract w j(b0 b0Var);

    public abstract i0 k(b0 b0Var);

    public abstract k0 l(b0 b0Var);
}
