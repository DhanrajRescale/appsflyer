package l7;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import h.q0;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f24127l = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: b, reason: collision with root package name */
    public final String[] f24129b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f24130c;

    /* renamed from: d, reason: collision with root package name */
    public final s f24131d;

    /* renamed from: g, reason: collision with root package name */
    public volatile q7.g f24134g;

    /* renamed from: h, reason: collision with root package name */
    public final g f24135h;

    /* renamed from: i, reason: collision with root package name */
    public final tr.e f24136i;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f24132e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f24133f = false;

    /* renamed from: j, reason: collision with root package name */
    public final o.g f24137j = new o.g();

    /* renamed from: k, reason: collision with root package name */
    public final q0 f24138k = new q0(this, 11);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f24128a = new HashMap();

    public k(s sVar, HashMap hashMap, HashMap hashMap2, String... strArr) {
        this.f24131d = sVar;
        this.f24135h = new g(strArr.length);
        this.f24130c = hashMap2;
        this.f24136i = new tr.e(sVar);
        int length = strArr.length;
        this.f24129b = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f24128a.put(lowerCase, Integer.valueOf(i10));
            String str2 = (String) hashMap.get(strArr[i10]);
            if (str2 != null) {
                this.f24129b[i10] = str2.toLowerCase(locale);
            } else {
                this.f24129b[i10] = lowerCase;
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = str3.toLowerCase(locale2);
            if (this.f24128a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap hashMap3 = this.f24128a;
                hashMap3.put(lowerCase3, hashMap3.get(lowerCase2));
            }
        }
    }

    public final void a(h hVar) {
        i iVar;
        boolean z10;
        s sVar;
        p7.a aVar;
        String[] d10 = d(hVar.f24120a);
        int length = d10.length;
        int[] iArr = new int[length];
        int length2 = d10.length;
        for (int i10 = 0; i10 < length2; i10++) {
            Integer num = (Integer) this.f24128a.get(d10[i10].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i10] = num.intValue();
            } else {
                throw new IllegalArgumentException("There is no table with name " + d10[i10]);
            }
        }
        i iVar2 = new i(hVar, iArr, d10);
        synchronized (this.f24137j) {
            iVar = (i) this.f24137j.e(hVar, iVar2);
        }
        if (iVar == null) {
            g gVar = this.f24135h;
            synchronized (gVar) {
                z10 = false;
                for (int i11 = 0; i11 < length; i11++) {
                    try {
                        int i12 = iArr[i11];
                        Object obj = gVar.f24117c;
                        long j10 = ((long[]) obj)[i12];
                        ((long[]) obj)[i12] = 1 + j10;
                        if (j10 == 0) {
                            z10 = true;
                            gVar.f24115a = true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (z10 && (aVar = (sVar = this.f24131d).f24159a) != null && ((q7.b) aVar).f31808a.isOpen()) {
                f(sVar.f24162d.A());
            }
        }
    }

    public final boolean b() {
        boolean z10;
        p7.a aVar = this.f24131d.f24159a;
        if (aVar != null && ((q7.b) aVar).f31808a.isOpen()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        if (!this.f24133f) {
            this.f24131d.f24162d.A();
        }
        if (this.f24133f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void c(h hVar) {
        i iVar;
        boolean z10;
        s sVar;
        p7.a aVar;
        synchronized (this.f24137j) {
            iVar = (i) this.f24137j.g(hVar);
        }
        if (iVar != null) {
            g gVar = this.f24135h;
            int[] iArr = iVar.f24121a;
            synchronized (gVar) {
                try {
                    z10 = false;
                    for (int i10 : iArr) {
                        Object obj = gVar.f24117c;
                        long j10 = ((long[]) obj)[i10];
                        ((long[]) obj)[i10] = j10 - 1;
                        if (j10 == 1) {
                            z10 = true;
                            gVar.f24115a = true;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10 && (aVar = (sVar = this.f24131d).f24159a) != null && ((q7.b) aVar).f31808a.isOpen()) {
                f(sVar.f24162d.A());
            }
        }
    }

    public final String[] d(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            Map map = this.f24130c;
            if (map.containsKey(lowerCase)) {
                hashSet.addAll((Collection) map.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public final void e(p7.a aVar, int i10) {
        q7.b bVar = (q7.b) aVar;
        bVar.c(jr.h.o("INSERT OR IGNORE INTO room_table_modification_log VALUES(", i10, ", 0)"));
        String str = this.f24129b[i10];
        StringBuilder sb2 = new StringBuilder();
        String[] strArr = f24127l;
        for (int i11 = 0; i11 < 3; i11++) {
            String str2 = strArr[i11];
            sb2.setLength(0);
            sb2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb2.append("`");
            sb2.append("room_table_modification_trigger_");
            v.e.v(sb2, str, "_", str2, "`");
            v.e.v(sb2, " AFTER ", str2, " ON `", str);
            v.e.v(sb2, "` BEGIN UPDATE ", "room_table_modification_log", " SET ", "invalidated");
            v.e.v(sb2, " = 1", " WHERE ", "table_id", " = ");
            nn.d.w(sb2, i10, " AND ", "invalidated", " = 0");
            sb2.append("; END");
            bVar.c(sb2.toString());
        }
    }

    public final void f(p7.a aVar) {
        if (((q7.b) aVar).f31808a.inTransaction()) {
            return;
        }
        while (true) {
            try {
                ReentrantReadWriteLock.ReadLock readLock = this.f24131d.f24167i.readLock();
                readLock.lock();
                try {
                    int[] d10 = this.f24135h.d();
                    if (d10 == null) {
                        readLock.unlock();
                        return;
                    }
                    int length = d10.length;
                    q7.b bVar = (q7.b) aVar;
                    bVar.a();
                    for (int i10 = 0; i10 < length; i10++) {
                        try {
                            int i11 = d10[i10];
                            if (i11 != 1) {
                                if (i11 == 2) {
                                    String str = this.f24129b[i10];
                                    StringBuilder sb2 = new StringBuilder();
                                    String[] strArr = f24127l;
                                    for (int i12 = 0; i12 < 3; i12++) {
                                        String str2 = strArr[i12];
                                        sb2.setLength(0);
                                        sb2.append("DROP TRIGGER IF EXISTS ");
                                        sb2.append("`");
                                        sb2.append("room_table_modification_trigger_");
                                        sb2.append(str);
                                        sb2.append("_");
                                        sb2.append(str2);
                                        sb2.append("`");
                                        ((q7.b) aVar).c(sb2.toString());
                                    }
                                }
                            } else {
                                e(aVar, i10);
                            }
                        } catch (Throwable th2) {
                            bVar.b();
                            throw th2;
                        }
                    }
                    bVar.g();
                    bVar.b();
                    g gVar = this.f24135h;
                    synchronized (gVar) {
                        gVar.f24116b = false;
                    }
                    readLock.unlock();
                } catch (Throwable th3) {
                    readLock.unlock();
                    throw th3;
                }
            } catch (SQLiteException | IllegalStateException e10) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
                return;
            }
        }
    }
}
