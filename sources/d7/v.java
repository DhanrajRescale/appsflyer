package d7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b5.a1;
import b5.j1;
import b5.k1;
import com.assetgro.stockgro.prod.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import k7.y1;
import k7.z0;

/* loaded from: classes.dex */
public abstract class v extends z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14127d;

    /* renamed from: e, reason: collision with root package name */
    public Object f14128e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f14129f;

    /* JADX WARN: Type inference failed for: r3v0, types: [k7.d, java.lang.Object] */
    public v(k7.w wVar) {
        this.f14127d = 1;
        k7.q0 q0Var = new k7.q0(this);
        this.f14129f = q0Var;
        k7.c cVar = new k7.c(this);
        ?? obj = new Object();
        if (obj.f22322a == null) {
            synchronized (k7.d.f22320b) {
                try {
                    if (k7.d.f22321c == null) {
                        k7.d.f22321c = Executors.newFixedThreadPool(2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            obj.f22322a = k7.d.f22321c;
        }
        k7.h hVar = new k7.h(cVar, new h.c(23, null, obj.f22322a, wVar));
        this.f14128e = hVar;
        hVar.f22372d.add(q0Var);
    }

    @Override // k7.z0
    public final int a() {
        switch (this.f14127d) {
            case 0:
                if (((List) this.f14128e).isEmpty()) {
                    return 0;
                }
                return ((List) this.f14128e).size() + 1;
            default:
                return ((k7.h) this.f14128e).f22374f.size();
        }
    }

    @Override // k7.z0
    public y1 i(int i10, RecyclerView recyclerView) {
        return new s(LayoutInflater.from(((x) this.f14129f).getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, (ViewGroup) recyclerView, false));
    }

    public final List p() {
        return ((k7.h) this.f14128e).f22374f;
    }

    public final Object q(int i10) {
        return ((k7.h) this.f14128e).f22374f.get(i10);
    }

    public void r(s sVar, int i10) {
        final a1 a1Var = ((x) this.f14129f).f14174y0;
        if (a1Var == null) {
            return;
        }
        if (i10 == 0) {
            s(sVar);
            return;
        }
        boolean z10 = true;
        final t tVar = (t) ((List) this.f14128e).get(i10 - 1);
        final j1 j1Var = tVar.f14113a.f3552b;
        int i11 = 0;
        if (((i5.g0) a1Var).D().f3487y.get(j1Var) == null || !tVar.f14113a.f3555e[tVar.f14114b]) {
            z10 = false;
        }
        sVar.f14110u.setText(tVar.f14115c);
        if (!z10) {
            i11 = 4;
        }
        sVar.f14111v.setVisibility(i11);
        sVar.f22629a.setOnClickListener(new View.OnClickListener() { // from class: d7.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v vVar = v.this;
                vVar.getClass();
                b5.i iVar = (b5.i) a1Var;
                if (iVar.b(29)) {
                    i5.g0 g0Var = (i5.g0) iVar;
                    u5.i D = g0Var.D();
                    D.getClass();
                    u5.h hVar = new u5.h(D);
                    t tVar2 = tVar;
                    hVar.e(new k1(j1Var, lp.o0.v(Integer.valueOf(tVar2.f14114b))));
                    hVar.g(tVar2.f14113a.f3552b.f3378c);
                    g0Var.Q(new u5.i(hVar));
                    vVar.t(tVar2.f14115c);
                    ((x) vVar.f14129f).f14146k.dismiss();
                }
            }
        });
    }

    public abstract void s(s sVar);

    public abstract void t(String str);

    public final void u(List list) {
        k7.h hVar = (k7.h) this.f14128e;
        int i10 = hVar.f22375g + 1;
        hVar.f22375g = i10;
        List list2 = hVar.f22373e;
        if (list != list2) {
            k7.r0 r0Var = hVar.f22369a;
            if (list == null) {
                int size = list2.size();
                hVar.f22373e = null;
                hVar.f22374f = Collections.emptyList();
                r0Var.c(0, size);
                hVar.a(null);
                return;
            }
            if (list2 == null) {
                hVar.f22373e = list;
                hVar.f22374f = Collections.unmodifiableList(list);
                r0Var.b(0, list.size());
                hVar.a(null);
                return;
            }
            ((Executor) hVar.f22370b.f17584c).execute(new k7.f(hVar, list2, list, i10));
        }
    }

    public v(x xVar) {
        this.f14127d = 0;
        this.f14129f = xVar;
        this.f14128e = new ArrayList();
    }
}
