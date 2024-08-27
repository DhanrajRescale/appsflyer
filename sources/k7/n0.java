package k7;

import android.view.View;
import com.google.android.gms.common.api.Api;
import java.util.List;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f22492a;

    /* renamed from: b, reason: collision with root package name */
    public int f22493b;

    /* renamed from: c, reason: collision with root package name */
    public int f22494c;

    /* renamed from: d, reason: collision with root package name */
    public int f22495d;

    /* renamed from: e, reason: collision with root package name */
    public int f22496e;

    /* renamed from: f, reason: collision with root package name */
    public int f22497f;

    /* renamed from: g, reason: collision with root package name */
    public int f22498g;

    /* renamed from: h, reason: collision with root package name */
    public int f22499h;

    /* renamed from: i, reason: collision with root package name */
    public int f22500i;

    /* renamed from: j, reason: collision with root package name */
    public int f22501j;

    /* renamed from: k, reason: collision with root package name */
    public List f22502k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f22503l;

    public final void a(View view) {
        int e10;
        int size = this.f22502k.size();
        View view2 = null;
        int i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = ((y1) this.f22502k.get(i11)).f22629a;
            j1 j1Var = (j1) view3.getLayoutParams();
            if (view3 != view && !j1Var.f22430a.l() && (e10 = (j1Var.f22430a.e() - this.f22495d) * this.f22496e) >= 0 && e10 < i10) {
                view2 = view3;
                if (e10 == 0) {
                    break;
                } else {
                    i10 = e10;
                }
            }
        }
        if (view2 == null) {
            this.f22495d = -1;
        } else {
            this.f22495d = ((j1) view2.getLayoutParams()).f22430a.e();
        }
    }

    public final View b(u6.g gVar) {
        List list = this.f22502k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = ((y1) this.f22502k.get(i10)).f22629a;
                j1 j1Var = (j1) view.getLayoutParams();
                if (!j1Var.f22430a.l() && this.f22495d == j1Var.f22430a.e()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View e10 = gVar.e(this.f22495d);
        this.f22495d += this.f22496e;
        return e10;
    }
}
