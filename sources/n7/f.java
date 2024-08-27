package n7;

import android.database.Cursor;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f28353a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f28354b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f28355c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f28356d;

    public f(String str, HashMap hashMap, HashSet hashSet, HashSet hashSet2) {
        Set unmodifiableSet;
        this.f28353a = str;
        this.f28354b = Collections.unmodifiableMap(hashMap);
        this.f28355c = Collections.unmodifiableSet(hashSet);
        if (hashSet2 == null) {
            unmodifiableSet = null;
        } else {
            unmodifiableSet = Collections.unmodifiableSet(hashSet2);
        }
        this.f28356d = unmodifiableSet;
    }

    public static f a(q7.b bVar, String str) {
        boolean z10;
        int i10;
        int i11;
        ArrayList arrayList;
        int i12;
        boolean z11;
        Cursor d10 = bVar.d("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (d10.getColumnCount() > 0) {
                int columnIndex = d10.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
                int columnIndex2 = d10.getColumnIndex("type");
                int columnIndex3 = d10.getColumnIndex("notnull");
                int columnIndex4 = d10.getColumnIndex("pk");
                int columnIndex5 = d10.getColumnIndex("dflt_value");
                while (d10.moveToNext()) {
                    String string = d10.getString(columnIndex);
                    String string2 = d10.getString(columnIndex2);
                    if (d10.getInt(columnIndex3) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    hashMap.put(string, new b(string, string2, d10.getString(columnIndex5), d10.getInt(columnIndex4), 2, z11));
                }
            }
            d10.close();
            HashSet hashSet = new HashSet();
            d10 = bVar.d("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = d10.getColumnIndex("id");
                int columnIndex7 = d10.getColumnIndex("seq");
                int columnIndex8 = d10.getColumnIndex("table");
                int columnIndex9 = d10.getColumnIndex("on_delete");
                int columnIndex10 = d10.getColumnIndex("on_update");
                ArrayList b10 = b(d10);
                int count = d10.getCount();
                int i13 = 0;
                while (i13 < count) {
                    d10.moveToPosition(i13);
                    if (d10.getInt(columnIndex7) != 0) {
                        i10 = columnIndex6;
                        i11 = columnIndex7;
                        arrayList = b10;
                        i12 = count;
                    } else {
                        int i14 = d10.getInt(columnIndex6);
                        i10 = columnIndex6;
                        ArrayList arrayList2 = new ArrayList();
                        i11 = columnIndex7;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = b10.iterator();
                        while (it.hasNext()) {
                            ArrayList arrayList4 = b10;
                            d dVar = (d) it.next();
                            int i15 = count;
                            if (dVar.f28346a == i14) {
                                arrayList2.add(dVar.f28348c);
                                arrayList3.add(dVar.f28349d);
                            }
                            count = i15;
                            b10 = arrayList4;
                        }
                        arrayList = b10;
                        i12 = count;
                        hashSet.add(new c(d10.getString(columnIndex8), d10.getString(columnIndex9), d10.getString(columnIndex10), arrayList2, arrayList3));
                    }
                    i13++;
                    columnIndex6 = i10;
                    columnIndex7 = i11;
                    count = i12;
                    b10 = arrayList;
                }
                d10.close();
                d10 = bVar.d("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = d10.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    int columnIndex12 = d10.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
                    int columnIndex13 = d10.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                        HashSet hashSet3 = new HashSet();
                        while (d10.moveToNext()) {
                            if ("c".equals(d10.getString(columnIndex12))) {
                                String string3 = d10.getString(columnIndex11);
                                if (d10.getInt(columnIndex13) == 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                e c10 = c(bVar, string3, z10);
                                if (c10 != null) {
                                    hashSet3.add(c10);
                                }
                            }
                        }
                        d10.close();
                        hashSet2 = hashSet3;
                        return new f(str, hashMap, hashSet, hashSet2);
                    }
                    return new f(str, hashMap, hashSet, hashSet2);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static ArrayList b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < count; i10++) {
            cursor.moveToPosition(i10);
            arrayList.add(new d(cursor.getString(columnIndex3), cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Finally extract failed */
    public static e c(q7.b bVar, String str, boolean z10) {
        Cursor d10 = bVar.d("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = d10.getColumnIndex("seqno");
            int columnIndex2 = d10.getColumnIndex("cid");
            int columnIndex3 = d10.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (d10.moveToNext()) {
                    if (d10.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(d10.getInt(columnIndex)), d10.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                e eVar = new e(arrayList, str, z10);
                d10.close();
                return eVar;
            }
            d10.close();
            return null;
        } catch (Throwable th2) {
            d10.close();
            throw th2;
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        String str = fVar.f28353a;
        String str2 = this.f28353a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        Map map = fVar.f28354b;
        Map map2 = this.f28354b;
        if (map2 == null ? map != null : !map2.equals(map)) {
            return false;
        }
        Set set2 = fVar.f28355c;
        Set set3 = this.f28355c;
        if (set3 == null ? set2 != null : !set3.equals(set2)) {
            return false;
        }
        Set set4 = this.f28356d;
        if (set4 == null || (set = fVar.f28356d) == null) {
            return true;
        }
        return set4.equals(set);
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f28353a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = i10 * 31;
        Map map = this.f28354b;
        if (map != null) {
            i11 = map.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        Set set = this.f28355c;
        if (set != null) {
            i12 = set.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        return "TableInfo{name='" + this.f28353a + "', columns=" + this.f28354b + ", foreignKeys=" + this.f28355c + ", indices=" + this.f28356d + UrlTreeKt.componentParamSuffixChar;
    }
}
