package fu;

import java.io.File;
import java.util.ArrayDeque;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e extends vt.c {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f16256c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f16257d;

    public e(g gVar) {
        this.f16257d = gVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f16256c = arrayDeque;
        if (gVar.f16259a.isDirectory()) {
            arrayDeque.push(c(gVar.f16259a));
        } else {
            if (gVar.f16259a.isFile()) {
                File rootFile = gVar.f16259a;
                Intrinsics.checkNotNullParameter(rootFile, "rootFile");
                arrayDeque.push(new f(rootFile));
                return;
            }
            this.f38308a = 2;
        }
    }

    @Override // vt.c
    public final void b() {
        File file;
        File a10;
        while (true) {
            ArrayDeque arrayDeque = this.f16256c;
            f fVar = (f) arrayDeque.peek();
            if (fVar == null) {
                file = null;
                break;
            }
            a10 = fVar.a();
            if (a10 == null) {
                arrayDeque.pop();
            } else if (Intrinsics.a(a10, fVar.f16258a) || !a10.isDirectory() || arrayDeque.size() >= this.f16257d.f16264f) {
                break;
            } else {
                arrayDeque.push(c(a10));
            }
        }
        file = a10;
        if (file != null) {
            this.f38309b = file;
            this.f38308a = 1;
        } else {
            this.f38308a = 2;
        }
    }

    public final a c(File file) {
        int ordinal = this.f16257d.f16260b.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return new b(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }
        return new d(this, file);
    }
}
