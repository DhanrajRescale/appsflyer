package j5;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements e5.j, qn.a, pn.h, Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f20991a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20992b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20993c;

    public /* synthetic */ l(Object obj, long j10, Object obj2) {
        this.f20992b = obj;
        this.f20993c = obj2;
        this.f20991a = j10;
    }

    @Override // pn.h
    public final Object apply(Object obj) {
        String str = (String) this.f20992b;
        mn.c cVar = (mn.c) this.f20993c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        gn.b bVar = pn.j.f31244f;
        boolean booleanValue = ((Boolean) pn.j.l(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(cVar.f27846a)}), new i5.w(13))).booleanValue();
        long j10 = this.f20991a;
        int i10 = cVar.f27846a;
        if (!booleanValue) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i10));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i10)});
        }
        return null;
    }

    @Override // qn.a
    public final Object execute() {
        on.h hVar = (on.h) this.f20992b;
        jn.i iVar = (jn.i) this.f20993c;
        long a10 = ((rn.c) hVar.f30144g).a() + this.f20991a;
        pn.j jVar = (pn.j) hVar.f30140c;
        jVar.getClass();
        jVar.c(new j(a10, iVar));
        return null;
    }

    @Override // e5.j
    public final void invoke(Object obj) {
        ((c) obj).getClass();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        jr.i iVar = (jr.i) this.f20992b;
        Map map = (Map) this.f20993c;
        int[] iArr = jr.i.f21606k;
        return iVar.b(this.f20991a, task, map);
    }

    public /* synthetic */ l(jr.i iVar, long j10, HashMap hashMap) {
        this.f20992b = iVar;
        this.f20991a = j10;
        this.f20993c = hashMap;
    }
}
