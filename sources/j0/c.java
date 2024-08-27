package j0;

import android.graphics.Rect;
import android.view.inputmethod.InputMethodManager;
import i0.h0;
import j2.e0;
import j2.f0;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p2.c0;
import p2.v;
import qu.h2;
import t.g0;

/* loaded from: classes.dex */
public final class c extends m {

    /* renamed from: b, reason: collision with root package name */
    public h2 f20569b;

    /* renamed from: c, reason: collision with root package name */
    public r f20570c;

    @Override // p2.x
    public final void a(c0 c0Var, v vVar, e0 e0Var, g0 g0Var, m1.d dVar, m1.d dVar2) {
        r rVar = this.f20570c;
        if (rVar != null) {
            f fVar = rVar.f20614j;
            synchronized (fVar.f20573c) {
                try {
                    fVar.f20580j = c0Var;
                    fVar.f20582l = vVar;
                    fVar.f20581k = e0Var;
                    fVar.f20583m = dVar;
                    fVar.f20584n = dVar2;
                    if (!fVar.f20575e) {
                        if (fVar.f20574d) {
                        }
                        Unit unit = Unit.f23355a;
                    }
                    fVar.a();
                    Unit unit2 = Unit.f23355a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // p2.x
    public final void b(c0 c0Var, p2.o oVar, c.g gVar, h0 h0Var) {
        j(new w.a(c0Var, oVar, gVar, h0Var, 6));
    }

    @Override // p2.x
    public final void c() {
        j(null);
    }

    @Override // p2.x
    public final void e() {
        h2 h2Var = this.f20569b;
        if (h2Var != null) {
            h2Var.a(null);
        }
        this.f20569b = null;
    }

    @Override // p2.x
    public final void f(m1.d dVar) {
        Rect rect;
        r rVar = this.f20570c;
        if (rVar != null) {
            rVar.f20613i = new Rect(ku.c.b(dVar.f27239a), ku.c.b(dVar.f27240b), ku.c.b(dVar.f27241c), ku.c.b(dVar.f27242d));
            if (rVar.f20611g.isEmpty() && (rect = rVar.f20613i) != null) {
                rVar.f20605a.requestRectangleOnScreen(new Rect(rect));
            }
        }
    }

    @Override // p2.x
    public final void h(c0 c0Var, c0 c0Var2) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        r rVar = this.f20570c;
        if (rVar != null) {
            if (f0.a(rVar.f20609e.f30523b, c0Var2.f30523b) && Intrinsics.a(rVar.f20609e.f30524c, c0Var2.f30524c)) {
                z10 = false;
            } else {
                z10 = true;
            }
            rVar.f20609e = c0Var2;
            int size = rVar.f20611g.size();
            for (int i13 = 0; i13 < size; i13++) {
                s sVar = (s) ((WeakReference) rVar.f20611g.get(i13)).get();
                if (sVar != null) {
                    sVar.f20618d = c0Var2;
                }
            }
            f fVar = rVar.f20614j;
            synchronized (fVar.f20573c) {
                fVar.f20580j = null;
                fVar.f20582l = null;
                fVar.f20581k = null;
                fVar.f20583m = null;
                fVar.f20584n = null;
                Unit unit = Unit.f23355a;
            }
            int i14 = -1;
            if (Intrinsics.a(c0Var, c0Var2)) {
                if (z10) {
                    g gVar = rVar.f20606b;
                    int e10 = f0.e(c0Var2.f30523b);
                    int d10 = f0.d(c0Var2.f30523b);
                    f0 f0Var = rVar.f20609e.f30524c;
                    if (f0Var != null) {
                        i12 = f0.e(f0Var.f20712a);
                    } else {
                        i12 = -1;
                    }
                    f0 f0Var2 = rVar.f20609e.f30524c;
                    if (f0Var2 != null) {
                        i14 = f0.d(f0Var2.f20712a);
                    }
                    h hVar = (h) gVar;
                    ((InputMethodManager) hVar.f20589b.getValue()).updateSelection(hVar.f20588a, e10, d10, i12, i14);
                    return;
                }
                return;
            }
            if (c0Var != null && (!Intrinsics.a(c0Var.f30522a.f20699a, c0Var2.f30522a.f20699a) || (f0.a(c0Var.f30523b, c0Var2.f30523b) && !Intrinsics.a(c0Var.f30524c, c0Var2.f30524c)))) {
                h hVar2 = (h) rVar.f20606b;
                ((InputMethodManager) hVar2.f20589b.getValue()).restartInput(hVar2.f20588a);
                return;
            }
            int size2 = rVar.f20611g.size();
            for (int i15 = 0; i15 < size2; i15++) {
                s sVar2 = (s) ((WeakReference) rVar.f20611g.get(i15)).get();
                if (sVar2 != null) {
                    c0 c0Var3 = rVar.f20609e;
                    g gVar2 = rVar.f20606b;
                    if (sVar2.f20622h) {
                        sVar2.f20618d = c0Var3;
                        if (sVar2.f20620f) {
                            h hVar3 = (h) gVar2;
                            ((InputMethodManager) hVar3.f20589b.getValue()).updateExtractedText(hVar3.f20588a, sVar2.f20619e, androidx.compose.foundation.text.input.internal.a.a(c0Var3));
                        }
                        f0 f0Var3 = c0Var3.f30524c;
                        if (f0Var3 != null) {
                            i10 = f0.e(f0Var3.f20712a);
                        } else {
                            i10 = -1;
                        }
                        f0 f0Var4 = c0Var3.f30524c;
                        if (f0Var4 != null) {
                            i11 = f0.d(f0Var4.f20712a);
                        } else {
                            i11 = -1;
                        }
                        long j10 = c0Var3.f30523b;
                        h hVar4 = (h) gVar2;
                        ((InputMethodManager) hVar4.f20589b.getValue()).updateSelection(hVar4.f20588a, f0.e(j10), f0.d(j10), i10, i11);
                    }
                }
            }
        }
    }

    public final void j(w.a aVar) {
        l lVar = this.f20598a;
        if (lVar == null) {
            return;
        }
        h2 h2Var = null;
        b bVar = new b(aVar, this, lVar, null);
        k kVar = (k) lVar;
        if (kVar.f16417m) {
            h2Var = yk.g.H(kVar.E0(), null, qu.g0.f32208d, new j(kVar, bVar, null), 1);
        }
        this.f20569b = h2Var;
    }
}
