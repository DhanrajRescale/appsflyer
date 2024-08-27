package pn;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31240a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f31241b;

    public /* synthetic */ g(j jVar, int i10) {
        this.f31240a = i10;
        this.f31241b = jVar;
    }

    @Override // pn.h
    public final Object apply(Object obj) {
        int i10 = this.f31240a;
        j jVar = this.f31241b;
        switch (i10) {
            case 0:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                jVar.getClass();
                sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
                sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + ((rn.c) jVar.f31246b).a()).execute();
                return null;
            case 1:
                Cursor cursor = (Cursor) obj;
                jVar.getClass();
                while (cursor.moveToNext()) {
                    jVar.c(new j5.l(cursor.getString(1), cursor.getInt(0), mn.c.MAX_RETRIES_REACHED));
                }
                return null;
            default:
                Cursor cursor2 = (Cursor) obj;
                jVar.getClass();
                while (cursor2.moveToNext()) {
                    jVar.c(new j5.l(cursor2.getString(1), cursor2.getInt(0), mn.c.MESSAGE_TOO_OLD));
                }
                return null;
        }
    }
}
