package androidx.databinding;

import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import m4.c;
import m4.m;

/* loaded from: classes.dex */
public class MergedDataBinderMapper extends c {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f1543a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f1544b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f1545c = new CopyOnWriteArrayList();

    @Override // m4.c
    public final m b(View view, int i10) {
        Iterator it = this.f1544b.iterator();
        while (it.hasNext()) {
            m b10 = ((c) it.next()).b(view, i10);
            if (b10 != null) {
                return b10;
            }
        }
        if (e()) {
            return b(view, i10);
        }
        return null;
    }

    @Override // m4.c
    public final m c(View[] viewArr, int i10) {
        Iterator it = this.f1544b.iterator();
        while (it.hasNext()) {
            m c10 = ((c) it.next()).c(viewArr, i10);
            if (c10 != null) {
                return c10;
            }
        }
        if (e()) {
            return c(viewArr, i10);
        }
        return null;
    }

    public final void d(c cVar) {
        if (this.f1543a.add(cVar.getClass())) {
            this.f1544b.add(cVar);
            Iterator it = cVar.a().iterator();
            while (it.hasNext()) {
                d((c) it.next());
            }
        }
    }

    public final boolean e() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1545c;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                Class<?> cls = Class.forName(str);
                if (c.class.isAssignableFrom(cls)) {
                    d((c) cls.newInstance());
                    copyOnWriteArrayList.remove(str);
                    z10 = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e10) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e10);
            } catch (InstantiationException e11) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e11);
            }
        }
        return z10;
    }
}
