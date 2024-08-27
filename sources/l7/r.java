package l7;

import android.content.Context;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public final String f24148b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f24149c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f24150d;

    /* renamed from: e, reason: collision with root package name */
    public Executor f24151e;

    /* renamed from: f, reason: collision with root package name */
    public Executor f24152f;

    /* renamed from: g, reason: collision with root package name */
    public p7.c f24153g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f24154h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f24156j;

    /* renamed from: l, reason: collision with root package name */
    public HashSet f24158l;

    /* renamed from: a, reason: collision with root package name */
    public final Class f24147a = WorkDatabase.class;

    /* renamed from: i, reason: collision with root package name */
    public boolean f24155i = true;

    /* renamed from: k, reason: collision with root package name */
    public final hr.c f24157k = new hr.c(18);

    public r(Context context, String str) {
        this.f24149c = context;
        this.f24148b = str;
    }

    public final void a(m7.a... aVarArr) {
        if (this.f24158l == null) {
            this.f24158l = new HashSet();
        }
        for (m7.a aVar : aVarArr) {
            this.f24158l.add(Integer.valueOf(aVar.f27629a));
            this.f24158l.add(Integer.valueOf(aVar.f27630b));
        }
        hr.c cVar = this.f24157k;
        cVar.getClass();
        for (m7.a aVar2 : aVarArr) {
            int i10 = aVar2.f27629a;
            TreeMap treeMap = (TreeMap) ((HashMap) cVar.f18690b).get(Integer.valueOf(i10));
            if (treeMap == null) {
                treeMap = new TreeMap();
                ((HashMap) cVar.f18690b).put(Integer.valueOf(i10), treeMap);
            }
            int i11 = aVar2.f27630b;
            m7.a aVar3 = (m7.a) treeMap.get(Integer.valueOf(i11));
            if (aVar3 != null) {
                Log.w("ROOM", "Overriding migration " + aVar3 + " with " + aVar2);
            }
            treeMap.put(Integer.valueOf(i11), aVar2);
        }
    }
}
