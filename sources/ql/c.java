package ql;

import al.d;
import bl.j;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import nl.l0;
import nl.n0;
import org.json.JSONArray;
import t0.s;
import vt.g0;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f32089a = new AtomicBoolean(false);

    public static final void a() {
        File[] listFiles;
        if (sl.a.b(c.class)) {
            return;
        }
        try {
            if (n0.y()) {
                return;
            }
            File D = j.D();
            int i10 = 0;
            if (D == null) {
                listFiles = new File[0];
            } else {
                listFiles = D.listFiles(new l0(3));
                if (listFiles == null) {
                    listFiles = new File[0];
                }
            }
            ArrayList arrayList = new ArrayList(listFiles.length);
            for (File file : listFiles) {
                arrayList.add(d.z0(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((pl.c) obj).a()) {
                    arrayList2.add(obj);
                }
            }
            List M = g0.M(arrayList2, new s(26));
            JSONArray jSONArray = new JSONArray();
            Iterator<Integer> it = kotlin.ranges.d.k(0, Math.min(M.size(), 5)).iterator();
            while (it.hasNext()) {
                jSONArray.put(M.get(((vt.l0) it).b()));
            }
            j.Y("anr_reports", jSONArray, new b(i10, M));
        } catch (Throwable th2) {
            sl.a.a(c.class, th2);
        }
    }
}
