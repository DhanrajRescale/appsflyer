package lk;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import ek.h0;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    public final a f24878a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f24879b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f24880c;

    /* renamed from: d, reason: collision with root package name */
    public com.bumptech.glide.h f24881d;

    /* renamed from: e, reason: collision with root package name */
    public g f24882e;

    /* renamed from: f, reason: collision with root package name */
    public Fragment f24883f;

    public g() {
        a aVar = new a();
        this.f24879b = new h0(this, 2);
        this.f24880c = new HashSet();
        this.f24878a = aVar;
    }

    public final void a(Activity activity) {
        g gVar = this.f24882e;
        if (gVar != null) {
            gVar.f24880c.remove(this);
            this.f24882e = null;
        }
        h hVar = com.bumptech.glide.b.b(activity).f10783f;
        hVar.getClass();
        g g10 = hVar.g(activity.getFragmentManager(), null, h.i(activity));
        this.f24882e = g10;
        if (!equals(g10)) {
            this.f24882e.f24880c.add(this);
        }
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException e10) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e10);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a aVar = this.f24878a;
        aVar.f24872c = true;
        Iterator it = rk.k.d(aVar.f24870a).iterator();
        while (it.hasNext()) {
            ((e) it.next()).onDestroy();
        }
        g gVar = this.f24882e;
        if (gVar != null) {
            gVar.f24880c.remove(this);
            this.f24882e = null;
        }
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        g gVar = this.f24882e;
        if (gVar != null) {
            gVar.f24880c.remove(this);
            this.f24882e = null;
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f24878a.c();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a aVar = this.f24878a;
        aVar.f24871b = false;
        Iterator it = rk.k.d(aVar.f24870a).iterator();
        while (it.hasNext()) {
            ((e) it.next()).onStop();
        }
    }

    @Override // android.app.Fragment
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f24883f;
        }
        sb2.append(parentFragment);
        sb2.append(UrlTreeKt.componentParamSuffix);
        return sb2.toString();
    }
}
