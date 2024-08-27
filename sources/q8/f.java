package q8;

import bv.b0;
import bv.i0;
import bv.k0;
import bv.p;
import bv.q;
import bv.w;
import bv.x;
import iu.a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends q {

    /* renamed from: b, reason: collision with root package name */
    public final q f31842b;

    public f(x delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f31842b = delegate;
    }

    public static void m(b0 path, String functionName, String parameterName) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(parameterName, "parameterName");
    }

    @Override // bv.q
    public final i0 a(b0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        m(file, "appendingSink", "file");
        return this.f31842b.a(file);
    }

    @Override // bv.q
    public final void b(b0 source, b0 target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        m(source, "atomicMove", "source");
        m(target, "atomicMove", "target");
        this.f31842b.b(source, target);
    }

    @Override // bv.q
    public final void c(b0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        m(dir, "createDirectory", "dir");
        this.f31842b.c(dir);
    }

    @Override // bv.q
    public final void d(b0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        m(path, "delete", "path");
        this.f31842b.d(path);
    }

    @Override // bv.q
    public final List g(b0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        m(dir, "list", "dir");
        List<b0> g10 = this.f31842b.g(dir);
        ArrayList arrayList = new ArrayList();
        for (b0 path : g10) {
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter("list", "functionName");
            arrayList.add(path);
        }
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    @Override // bv.q
    public final p i(b0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        m(path, "metadataOrNull", "path");
        p i10 = this.f31842b.i(path);
        if (i10 == null) {
            return null;
        }
        b0 path2 = i10.f7383c;
        if (path2 != null) {
            Intrinsics.checkNotNullParameter(path2, "path");
            Intrinsics.checkNotNullParameter("metadataOrNull", "functionName");
            boolean z10 = i10.f7381a;
            boolean z11 = i10.f7382b;
            Long l10 = i10.f7384d;
            Long l11 = i10.f7385e;
            Long l12 = i10.f7386f;
            Long l13 = i10.f7387g;
            Map extras = i10.f7388h;
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new p(z10, z11, path2, l10, l11, l12, l13, extras);
        }
        return i10;
    }

    @Override // bv.q
    public final w j(b0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        m(file, "openReadOnly", "file");
        return this.f31842b.j(file);
    }

    @Override // bv.q
    public final i0 k(b0 file) {
        b0 dir = file.b();
        if (dir != null) {
            Intrinsics.checkNotNullParameter(dir, "dir");
            Intrinsics.checkNotNullParameter(dir, "dir");
            Intrinsics.checkNotNullParameter(this, "<this>");
            Intrinsics.checkNotNullParameter(dir, "dir");
            vt.q qVar = new vt.q();
            while (dir != null && !f(dir)) {
                qVar.g(dir);
                dir = dir.b();
            }
            Iterator<E> it = qVar.iterator();
            while (it.hasNext()) {
                b0 dir2 = (b0) it.next();
                Intrinsics.checkNotNullParameter(dir2, "dir");
                c(dir2);
            }
        }
        Intrinsics.checkNotNullParameter(file, "file");
        m(file, "sink", "file");
        return this.f31842b.k(file);
    }

    @Override // bv.q
    public final k0 l(b0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        m(file, "source", "file");
        return this.f31842b.l(file);
    }

    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return a0.a(f.class).b() + '(' + this.f31842b + ')';
    }
}
