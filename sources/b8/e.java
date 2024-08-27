package b8;

import androidx.work.k0;
import androidx.work.u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends bl.j {

    /* renamed from: g, reason: collision with root package name */
    public static final String f4086g = u.C("WorkContinuationImpl");

    /* renamed from: b, reason: collision with root package name */
    public final l f4087b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4088c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4089d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f4090e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f4091f;

    public e(l lVar, List list) {
        this.f4087b = lVar;
        this.f4088c = list;
        this.f4089d = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            String uuid = ((k0) list.get(i10)).f2623a.toString();
            this.f4089d.add(uuid);
            this.f4090e.add(uuid);
        }
    }

    public static boolean a0(e eVar, HashSet hashSet) {
        hashSet.addAll(eVar.f4089d);
        HashSet b02 = b0(eVar);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (b02.contains((String) it.next())) {
                return true;
            }
        }
        hashSet.removeAll(eVar.f4089d);
        return false;
    }

    public static HashSet b0(e eVar) {
        HashSet hashSet = new HashSet();
        eVar.getClass();
        return hashSet;
    }
}
