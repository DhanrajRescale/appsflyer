package ao;

import android.view.View;
import d4.d3;
import d4.g2;
import d4.p2;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class h extends g2 {

    /* renamed from: c, reason: collision with root package name */
    public final View f2672c;

    /* renamed from: d, reason: collision with root package name */
    public int f2673d;

    /* renamed from: e, reason: collision with root package name */
    public int f2674e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f2675f;

    public h(View view) {
        super(0);
        this.f2675f = new int[2];
        this.f2672c = view;
    }

    @Override // d4.g2
    public final void a(p2 p2Var) {
        this.f2672c.setTranslationY(s0.g.f34069a);
    }

    @Override // d4.g2
    public final void b() {
        View view = this.f2672c;
        int[] iArr = this.f2675f;
        view.getLocationOnScreen(iArr);
        this.f2673d = iArr[1];
    }

    @Override // d4.g2
    public final d3 c(d3 d3Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((p2) it.next()).f13805a.c() & 8) != 0) {
                this.f2672c.setTranslationY(vn.a.c(this.f2674e, r0.f13805a.b(), 0));
                break;
            }
        }
        return d3Var;
    }

    @Override // d4.g2
    public final tr.e d(tr.e eVar) {
        View view = this.f2672c;
        int[] iArr = this.f2675f;
        view.getLocationOnScreen(iArr);
        int i10 = this.f2673d - iArr[1];
        this.f2674e = i10;
        view.setTranslationY(i10);
        return eVar;
    }
}
