package lk;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.d1;
import androidx.fragment.app.g0;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import ek.u;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class j extends g0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f24893a;

    /* renamed from: b, reason: collision with root package name */
    public final u f24894b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f24895c;

    /* renamed from: d, reason: collision with root package name */
    public j f24896d;

    /* renamed from: e, reason: collision with root package name */
    public com.bumptech.glide.h f24897e;

    /* renamed from: f, reason: collision with root package name */
    public g0 f24898f;

    public j() {
        a aVar = new a();
        this.f24894b = new u(this, 3);
        this.f24895c = new HashSet();
        this.f24893a = aVar;
    }

    @Override // androidx.fragment.app.g0
    public final void onAttach(Context context) {
        super.onAttach(context);
        g0 g0Var = this;
        while (g0Var.getParentFragment() != null) {
            g0Var = g0Var.getParentFragment();
        }
        d1 fragmentManager = g0Var.getFragmentManager();
        if (fragmentManager == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
            }
        } else {
            try {
                p(getContext(), fragmentManager);
            } catch (IllegalStateException e10) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e10);
                }
            }
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onDestroy() {
        super.onDestroy();
        a aVar = this.f24893a;
        aVar.f24872c = true;
        Iterator it = rk.k.d(aVar.f24870a).iterator();
        while (it.hasNext()) {
            ((e) it.next()).onDestroy();
        }
        j jVar = this.f24896d;
        if (jVar != null) {
            jVar.f24895c.remove(this);
            this.f24896d = null;
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onDetach() {
        super.onDetach();
        this.f24898f = null;
        j jVar = this.f24896d;
        if (jVar != null) {
            jVar.f24895c.remove(this);
            this.f24896d = null;
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onStart() {
        super.onStart();
        this.f24893a.c();
    }

    @Override // androidx.fragment.app.g0
    public final void onStop() {
        super.onStop();
        a aVar = this.f24893a;
        aVar.f24871b = false;
        Iterator it = rk.k.d(aVar.f24870a).iterator();
        while (it.hasNext()) {
            ((e) it.next()).onStop();
        }
    }

    public final void p(Context context, d1 d1Var) {
        j jVar = this.f24896d;
        if (jVar != null) {
            jVar.f24895c.remove(this);
            this.f24896d = null;
        }
        h hVar = com.bumptech.glide.b.b(context).f10783f;
        hVar.getClass();
        j h10 = hVar.h(d1Var, null, h.i(context));
        this.f24896d = h10;
        if (!equals(h10)) {
            this.f24896d.f24895c.add(this);
        }
    }

    @Override // androidx.fragment.app.g0
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{parent=");
        g0 parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f24898f;
        }
        sb2.append(parentFragment);
        sb2.append(UrlTreeKt.componentParamSuffix);
        return sb2.toString();
    }
}
