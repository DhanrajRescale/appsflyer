package bl;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import com.facebook.FacebookSdk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import nl.a0;
import nl.n0;
import nl.y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f7097a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f7098b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f7099c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7100d;

    public g(View view, Handler handler, HashSet listenerSet, String activityName) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(listenerSet, "listenerSet");
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        this.f7097a = new WeakReference(view);
        this.f7099c = listenerSet;
        this.f7100d = activityName;
        handler.postDelayed(this, 200L);
    }

    public final void a(f fVar, View rootView, cl.c mapping) {
        boolean z10;
        HashSet hashSet;
        String str;
        View hostView = fVar.a();
        if (hostView == null) {
            return;
        }
        View.OnClickListener e10 = cl.g.e(hostView);
        if (e10 instanceof a) {
            if (e10 != null) {
                if (((a) e10).f7078e) {
                    z10 = true;
                    hashSet = this.f7099c;
                    str = fVar.f7096b;
                    if (hashSet.contains(str) && !z10) {
                        a aVar = null;
                        if (!sl.a.b(c.class)) {
                            try {
                                Intrinsics.checkNotNullParameter(mapping, "mapping");
                                Intrinsics.checkNotNullParameter(rootView, "rootView");
                                Intrinsics.checkNotNullParameter(hostView, "hostView");
                                aVar = new a(mapping, rootView, hostView);
                            } catch (Throwable th2) {
                                sl.a.a(c.class, th2);
                            }
                        }
                        hostView.setOnClickListener(aVar);
                        hashSet.add(str);
                        return;
                    }
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
            }
        }
        z10 = false;
        hashSet = this.f7099c;
        str = fVar.f7096b;
        if (hashSet.contains(str)) {
        }
    }

    public final void b(f fVar, View rootView, cl.c mapping) {
        boolean z10;
        HashSet hashSet;
        String str;
        AdapterView hostView = (AdapterView) fVar.a();
        if (hostView == null) {
            return;
        }
        AdapterView.OnItemClickListener onItemClickListener = hostView.getOnItemClickListener();
        if (onItemClickListener instanceof b) {
            if (onItemClickListener != null) {
                if (((b) onItemClickListener).f7083e) {
                    z10 = true;
                    hashSet = this.f7099c;
                    str = fVar.f7096b;
                    if (hashSet.contains(str) && !z10) {
                        b bVar = null;
                        if (!sl.a.b(c.class)) {
                            try {
                                Intrinsics.checkNotNullParameter(mapping, "mapping");
                                Intrinsics.checkNotNullParameter(rootView, "rootView");
                                Intrinsics.checkNotNullParameter(hostView, "hostView");
                                bVar = new b(mapping, rootView, hostView);
                            } catch (Throwable th2) {
                                sl.a.a(c.class, th2);
                            }
                        }
                        hostView.setOnItemClickListener(bVar);
                        hashSet.add(str);
                        return;
                    }
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
            }
        }
        z10 = false;
        hashSet = this.f7099c;
        str = fVar.f7096b;
        if (hashSet.contains(str)) {
        }
    }

    public final void c(f fVar, View rootView, cl.c mapping) {
        boolean z10;
        HashSet hashSet;
        String str;
        View hostView = fVar.a();
        if (hostView == null) {
            return;
        }
        View.OnTouchListener f10 = cl.g.f(hostView);
        if (f10 instanceof i) {
            if (f10 != null) {
                if (((i) f10).f7113e) {
                    z10 = true;
                    hashSet = this.f7099c;
                    str = fVar.f7096b;
                    if (hashSet.contains(str) && !z10) {
                        i iVar = null;
                        if (!sl.a.b(j.class)) {
                            try {
                                Intrinsics.checkNotNullParameter(mapping, "mapping");
                                Intrinsics.checkNotNullParameter(rootView, "rootView");
                                Intrinsics.checkNotNullParameter(hostView, "hostView");
                                iVar = new i(mapping, rootView, hostView);
                            } catch (Throwable th2) {
                                sl.a.a(j.class, th2);
                            }
                        }
                        hostView.setOnTouchListener(iVar);
                        hashSet.add(str);
                        return;
                    }
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
            }
        }
        z10 = false;
        hashSet = this.f7099c;
        str = fVar.f7096b;
        if (hashSet.contains(str)) {
        }
    }

    public final void d() {
        String str;
        View view;
        ArrayList arrayList = this.f7098b;
        if (arrayList != null) {
            WeakReference weakReference = this.f7097a;
            if (weakReference.get() != null) {
                int i10 = -1;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    int i11 = 0;
                    while (true) {
                        int i12 = i11 + 1;
                        cl.c cVar = (cl.c) arrayList.get(i11);
                        View view2 = (View) weakReference.get();
                        if (cVar != null && view2 != null) {
                            String str2 = this.f7100d;
                            String str3 = cVar.f8211d;
                            if (str3 == null || str3.length() == 0 || Intrinsics.a(str3, str2)) {
                                List unmodifiableList = Collections.unmodifiableList(cVar.f8209b);
                                Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(path)");
                                if (unmodifiableList.size() <= 25) {
                                    Iterator it = ek.h.n(view2, unmodifiableList, 0, i10, str2).iterator();
                                    while (it.hasNext()) {
                                        f fVar = (f) it.next();
                                        try {
                                            View a10 = fVar.a();
                                            if (a10 != null) {
                                                cl.g gVar = cl.g.f8225a;
                                                if (!sl.a.b(cl.g.class)) {
                                                    view = a10;
                                                    while (view != null) {
                                                        try {
                                                            cl.g gVar2 = cl.g.f8225a;
                                                            if (!sl.a.b(gVar2)) {
                                                                try {
                                                                    if (Intrinsics.a(view.getClass().getName(), "com.facebook.react.ReactRootView")) {
                                                                        break;
                                                                    }
                                                                } catch (Throwable th2) {
                                                                    sl.a.a(gVar2, th2);
                                                                }
                                                            }
                                                            Object parent = view.getParent();
                                                            if (!(parent instanceof View)) {
                                                                break;
                                                            } else {
                                                                view = (View) parent;
                                                            }
                                                        } catch (Throwable th3) {
                                                            sl.a.a(cl.g.class, th3);
                                                        }
                                                    }
                                                }
                                                view = null;
                                                if (view != null && cl.g.f8225a.l(a10, view)) {
                                                    c(fVar, view2, cVar);
                                                } else {
                                                    String name = a10.getClass().getName();
                                                    Intrinsics.checkNotNullExpressionValue(name, "view.javaClass.name");
                                                    if (!s.r(name, "com.facebook.react", false)) {
                                                        if (!(a10 instanceof AdapterView)) {
                                                            a(fVar, view2, cVar);
                                                        } else if (a10 instanceof ListView) {
                                                            b(fVar, view2, cVar);
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (Exception e10) {
                                            if (!sl.a.b(h.class)) {
                                                try {
                                                    str = h.f7102g;
                                                } catch (Throwable th4) {
                                                    sl.a.a(h.class, th4);
                                                    str = null;
                                                    n0.E(str, e10);
                                                }
                                                n0.E(str, e10);
                                            }
                                            str = null;
                                            n0.E(str, e10);
                                        }
                                    }
                                }
                            }
                        }
                        if (i12 <= size) {
                            i11 = i12;
                            i10 = -1;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        d();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        d();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (sl.a.b(this)) {
            return;
        }
        try {
            y b10 = a0.b(FacebookSdk.getApplicationId());
            if (b10 != null && b10.f28972g) {
                JSONArray jSONArray = b10.f28973h;
                ArrayList arrayList = new ArrayList();
                if (jSONArray != null) {
                    try {
                        int length = jSONArray.length();
                        if (length > 0) {
                            int i10 = 0;
                            while (true) {
                                int i11 = i10 + 1;
                                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                                Intrinsics.checkNotNullExpressionValue(jSONObject, "array.getJSONObject(i)");
                                arrayList.add(ek.h.t(jSONObject));
                                if (i11 >= length) {
                                    break;
                                } else {
                                    i10 = i11;
                                }
                            }
                        }
                    } catch (IllegalArgumentException | JSONException unused) {
                    }
                }
                this.f7098b = arrayList;
                View view = (View) this.f7097a.get();
                if (view == null) {
                    return;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnGlobalLayoutListener(this);
                    viewTreeObserver.addOnScrollChangedListener(this);
                }
                d();
            }
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }
}
