package pn;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import i5.w;
import ie.n;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class j implements d, qn.b, c {

    /* renamed from: f, reason: collision with root package name */
    public static final gn.b f31244f = new gn.b("proto");

    /* renamed from: a, reason: collision with root package name */
    public final m f31245a;

    /* renamed from: b, reason: collision with root package name */
    public final rn.a f31246b;

    /* renamed from: c, reason: collision with root package name */
    public final rn.a f31247c;

    /* renamed from: d, reason: collision with root package name */
    public final a f31248d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider f31249e;

    public j(rn.a aVar, rn.a aVar2, a aVar3, m mVar, Provider provider) {
        this.f31245a = mVar;
        this.f31246b = aVar;
        this.f31247c = aVar2;
        this.f31248d = aVar3;
        this.f31249e = provider;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, jn.i iVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f21499a, String.valueOf(sn.a.a(iVar.f21501c))));
        byte[] bArr = iVar.f21500b;
        if (bArr != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) l(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new w(17));
    }

    public static String j(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((b) it.next()).f31231a);
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static Object l(Cursor cursor, h hVar) {
        try {
            return hVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        m mVar = this.f31245a;
        Objects.requireNonNull(mVar);
        return (SQLiteDatabase) f(new dj.e(mVar, 17), new w(9));
    }

    public final Object c(h hVar) {
        SQLiteDatabase a10 = a();
        a10.beginTransaction();
        try {
            Object apply = hVar.apply(a10);
            a10.setTransactionSuccessful();
            return apply;
        } finally {
            a10.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f31245a.close();
    }

    public final ArrayList d(SQLiteDatabase sQLiteDatabase, jn.i iVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Long b10 = b(sQLiteDatabase, iVar);
        if (b10 == null) {
            return arrayList;
        }
        l(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", PaymentConstants.PAYLOAD, "code", "inline"}, "context_id = ?", new String[]{b10.toString()}, null, null, null, String.valueOf(i10)), new n(5, this, arrayList, iVar));
        return arrayList;
    }

    public final Object f(dj.e eVar, w wVar) {
        rn.c cVar = (rn.c) this.f31247c;
        long a10 = cVar.a();
        while (true) {
            try {
                int i10 = eVar.f14393a;
                Object obj = eVar.f14394b;
                switch (i10) {
                    case 17:
                        return ((m) obj).getWritableDatabase();
                    default:
                        ((SQLiteDatabase) obj).beginTransaction();
                        return null;
                }
            } catch (SQLiteDatabaseLockedException e10) {
                if (cVar.a() >= this.f31248d.f31228c + a10) {
                    return wVar.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object g(qn.a aVar) {
        SQLiteDatabase a10 = a();
        f(new dj.e(a10, 18), new w(11));
        try {
            Object execute = aVar.execute();
            a10.setTransactionSuccessful();
            return execute;
        } finally {
            a10.endTransaction();
        }
    }
}
