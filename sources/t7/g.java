package t7;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g extends q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35465a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35466b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f35467c;

    public /* synthetic */ g(int i10, Object obj, Object obj2) {
        this.f35465a = i10;
        this.f35467c = obj;
        this.f35466b = obj2;
    }

    @Override // t7.o
    public final void c(p pVar) {
        int i10 = this.f35465a;
        Object obj = this.f35466b;
        switch (i10) {
            case 0:
                d0 d0Var = y.f35540a;
                d0Var.u((View) obj, 1.0f);
                d0Var.getClass();
                pVar.w(this);
                return;
            case 1:
                ((ArrayList) ((t.f) obj).get(((r) this.f35467c).f35524b)).remove(pVar);
                pVar.w(this);
                return;
            default:
                ((p) obj).z();
                pVar.w(this);
                return;
        }
    }
}
