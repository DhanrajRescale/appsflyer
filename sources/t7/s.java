package t7;

import android.view.ViewGroup;
import com.assetgro.stockgro.prod.R;
import d4.n1;
import d4.y0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final a f35525a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f35526b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f35527c = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [t7.r, android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    public static void a(ViewGroup viewGroup, p pVar) {
        ArrayList arrayList = f35527c;
        if (!arrayList.contains(viewGroup)) {
            WeakHashMap weakHashMap = n1.f13788a;
            if (y0.c(viewGroup)) {
                arrayList.add(viewGroup);
                if (pVar == null) {
                    pVar = f35525a;
                }
                p clone = pVar.clone();
                ArrayList arrayList2 = (ArrayList) b().get(viewGroup);
                if (arrayList2 != null && arrayList2.size() > 0) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((p) it.next()).u(viewGroup);
                    }
                }
                if (clone != null) {
                    clone.h(viewGroup, true);
                }
                a3.a.u(viewGroup.getTag(R.id.transition_current_scene));
                viewGroup.setTag(R.id.transition_current_scene, null);
                if (clone != null) {
                    ?? obj = new Object();
                    obj.f35523a = clone;
                    obj.f35524b = viewGroup;
                    viewGroup.addOnAttachStateChangeListener(obj);
                    viewGroup.getViewTreeObserver().addOnPreDrawListener(obj);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [t.j0, java.lang.Object, t.f] */
    public static t.f b() {
        t.f fVar;
        ThreadLocal threadLocal = f35526b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (fVar = (t.f) weakReference.get()) != null) {
            return fVar;
        }
        ?? j0Var = new t.j0();
        threadLocal.set(new WeakReference(j0Var));
        return j0Var;
    }
}
