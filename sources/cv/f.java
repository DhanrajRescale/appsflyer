package cv;

import bv.b0;
import bv.i0;
import bv.k0;
import bv.p;
import bv.q;
import bv.x;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import kotlin.text.w;
import vt.d0;
import vt.g0;
import vt.z;

/* loaded from: classes2.dex */
public final class f extends q {

    /* renamed from: e, reason: collision with root package name */
    public static final b0 f13090e;

    /* renamed from: b, reason: collision with root package name */
    public final ClassLoader f13091b;

    /* renamed from: c, reason: collision with root package name */
    public final q f13092c;

    /* renamed from: d, reason: collision with root package name */
    public final ut.g f13093d;

    static {
        String str = b0.f7323b;
        f13090e = gt.d.f("/", false);
    }

    public f(ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        x systemFileSystem = q.f7389a;
        Intrinsics.checkNotNullParameter(systemFileSystem, "systemFileSystem");
        this.f13091b = classLoader;
        this.f13092c = systemFileSystem;
        this.f13093d = ut.h.a(new hj.b(this, 3));
    }

    public static String m(b0 child) {
        b0 b0Var = f13090e;
        b0Var.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        return c.b(b0Var, child, true).c(b0Var).f7324a.q();
    }

    @Override // bv.q
    public final i0 a(b0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // bv.q
    public final void b(b0 source, b0 target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // bv.q
    public final void c(b0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // bv.q
    public final void d(b0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // bv.q
    public final List g(b0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        String m10 = m(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (Pair pair : (List) this.f13093d.getValue()) {
            q qVar = (q) pair.f23353a;
            b0 base = (b0) pair.f23354b;
            try {
                List g10 = qVar.g(base.d(m10));
                ArrayList arrayList = new ArrayList();
                for (Object obj : g10) {
                    if (gt.d.a((b0) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(z.k(arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    b0 b0Var = (b0) it.next();
                    Intrinsics.checkNotNullParameter(b0Var, "<this>");
                    Intrinsics.checkNotNullParameter(base, "base");
                    arrayList2.add(f13090e.d(s.o(w.K(base.f7324a.q(), b0Var.f7324a.q()), '\\', '/')));
                }
                d0.m(arrayList2, linkedHashSet);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            return g0.R(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + dir);
    }

    @Override // bv.q
    public final p i(b0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (!gt.d.a(path)) {
            return null;
        }
        String m10 = m(path);
        for (Pair pair : (List) this.f13093d.getValue()) {
            p i10 = ((q) pair.f23353a).i(((b0) pair.f23354b).d(m10));
            if (i10 != null) {
                return i10;
            }
        }
        return null;
    }

    @Override // bv.q
    public final bv.w j(b0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (gt.d.a(file)) {
            String m10 = m(file);
            for (Pair pair : (List) this.f13093d.getValue()) {
                try {
                    return ((q) pair.f23353a).j(((b0) pair.f23354b).d(m10));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException("file not found: " + file);
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // bv.q
    public final i0 k(b0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // bv.q
    public final k0 l(b0 child) {
        Intrinsics.checkNotNullParameter(child, "file");
        if (gt.d.a(child)) {
            b0 b0Var = f13090e;
            b0Var.getClass();
            Intrinsics.checkNotNullParameter(child, "child");
            URL resource = this.f13091b.getResource(c.b(b0Var, child, false).c(b0Var).f7324a.q());
            if (resource != null) {
                URLConnection openConnection = resource.openConnection();
                if (openConnection instanceof JarURLConnection) {
                    ((JarURLConnection) openConnection).setUseCaches(false);
                }
                InputStream inputStream = openConnection.getInputStream();
                Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
                return hl.f.Z0(inputStream);
            }
            throw new FileNotFoundException("file not found: " + child);
        }
        throw new FileNotFoundException("file not found: " + child);
    }
}
