package bv;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o0 extends q {

    /* renamed from: e, reason: collision with root package name */
    public static final b0 f7377e;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f7378b;

    /* renamed from: c, reason: collision with root package name */
    public final q f7379c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f7380d;

    static {
        String str = b0.f7323b;
        f7377e = gt.d.f("/", false);
    }

    public o0(b0 zipPath, q fileSystem, LinkedHashMap entries) {
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f7378b = zipPath;
        this.f7379c = fileSystem;
        this.f7380d = entries;
    }

    @Override // bv.q
    public final i0 a(b0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // bv.q
    public final void b(b0 source, b0 target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // bv.q
    public final void c(b0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // bv.q
    public final void d(b0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // bv.q
    public final List g(b0 child) {
        Intrinsics.checkNotNullParameter(child, "dir");
        b0 b0Var = f7377e;
        b0Var.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        cv.g gVar = (cv.g) this.f7380d.get(cv.c.b(b0Var, child, true));
        if (gVar != null) {
            List R = vt.g0.R(gVar.f13110q);
            Intrinsics.c(R);
            return R;
        }
        throw new IOException("not a directory: " + child);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ce  */
    @Override // bv.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final bv.p i(bv.b0 r25) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bv.o0.i(bv.b0):bv.p");
    }

    @Override // bv.q
    public final w j(b0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // bv.q
    public final i0 k(b0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // bv.q
    public final k0 l(b0 child) {
        Throwable th2;
        e0 e0Var;
        Intrinsics.checkNotNullParameter(child, "file");
        b0 b0Var = f7377e;
        b0Var.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        cv.g gVar = (cv.g) this.f7380d.get(cv.c.b(b0Var, child, true));
        if (gVar != null) {
            w j10 = this.f7379c.j(this.f7378b);
            try {
                e0Var = hl.f.v(j10.c(gVar.f13101h));
                try {
                    j10.close();
                    th2 = null;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                if (j10 != null) {
                    try {
                        j10.close();
                    } catch (Throwable th5) {
                        ut.c.a(th4, th5);
                    }
                }
                th2 = th4;
                e0Var = null;
            }
            if (th2 == null) {
                Intrinsics.checkNotNullParameter(e0Var, "<this>");
                hl.f.K0(e0Var, null);
                int i10 = gVar.f13100g;
                long j11 = gVar.f13099f;
                if (i10 == 0) {
                    return new cv.d(e0Var, j11, true);
                }
                return new cv.d(new v(new cv.d(e0Var, gVar.f13098e, true), new Inflater(true)), j11, false);
            }
            throw th2;
        }
        throw new FileNotFoundException("no such file: " + child);
    }
}
