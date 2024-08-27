package j5;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements e5.j, pn.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20984a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f20985b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20986c;

    public /* synthetic */ j(long j10, jn.i iVar) {
        this.f20984a = 1;
        this.f20985b = j10;
        this.f20986c = iVar;
    }

    @Override // pn.h
    public final Object apply(Object obj) {
        int i10 = this.f20984a;
        long j10 = this.f20985b;
        Object obj2 = this.f20986c;
        switch (i10) {
            case 1:
                jn.i iVar = (jn.i) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                gn.b bVar = pn.j.f31244f;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j10));
                String str = iVar.f21499a;
                gn.c cVar = iVar.f21501c;
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(sn.a.a(cVar))}) < 1) {
                    contentValues.put("backend_name", iVar.f21499a);
                    contentValues.put("priority", Integer.valueOf(sn.a.a(cVar)));
                    sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                return null;
            default:
                pn.j jVar = (pn.j) obj2;
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                gn.b bVar2 = pn.j.f31244f;
                jVar.getClass();
                String[] strArr = {String.valueOf(j10)};
                pn.j.l(sQLiteDatabase2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new pn.g(jVar, 2));
                return Integer.valueOf(sQLiteDatabase2.delete("events", "timestamp_ms < ?", strArr));
        }
    }

    @Override // e5.j
    public final void invoke(Object obj) {
        ((c) obj).getClass();
    }

    public /* synthetic */ j(Object obj, int i10, long j10) {
        this.f20984a = i10;
        this.f20986c = obj;
        this.f20985b = j10;
    }
}
