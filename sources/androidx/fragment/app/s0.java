package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class s0 implements e.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1826a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f1827b;

    public /* synthetic */ s0(d1 d1Var, int i10) {
        this.f1826a = i10;
        this.f1827b = d1Var;
    }

    public final void a(e.a aVar) {
        int i10 = this.f1826a;
        d1 d1Var = this.f1827b;
        switch (i10) {
            case 1:
                y0 y0Var = (y0) d1Var.E.pollLast();
                if (y0Var == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    return;
                }
                String str = y0Var.f1858a;
                g0 c10 = d1Var.f1646c.c(str);
                if (c10 == null) {
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                    return;
                } else {
                    c10.onActivityResult(y0Var.f1859b, aVar.f14610a, aVar.f14611b);
                    return;
                }
            default:
                y0 y0Var2 = (y0) d1Var.E.pollFirst();
                if (y0Var2 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                String str2 = y0Var2.f1858a;
                g0 c11 = d1Var.f1646c.c(str2);
                if (c11 == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str2);
                    return;
                } else {
                    c11.onActivityResult(y0Var2.f1859b, aVar.f14610a, aVar.f14611b);
                    return;
                }
        }
    }

    @Override // e.b
    public final void d(Object obj) {
        int i10;
        switch (this.f1826a) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (((Boolean) arrayList.get(i11)).booleanValue()) {
                        i10 = 0;
                    } else {
                        i10 = -1;
                    }
                    iArr[i11] = i10;
                }
                d1 d1Var = this.f1827b;
                y0 y0Var = (y0) d1Var.E.pollFirst();
                if (y0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    return;
                }
                String str = y0Var.f1858a;
                g0 c10 = d1Var.f1646c.c(str);
                if (c10 == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    return;
                }
                c10.onRequestPermissionsResult(y0Var.f1859b, strArr, iArr);
                return;
            case 1:
                a((e.a) obj);
                return;
            default:
                a((e.a) obj);
                return;
        }
    }
}
