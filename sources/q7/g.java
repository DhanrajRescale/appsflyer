package q7;

import android.database.sqlite.SQLiteStatement;

/* loaded from: classes.dex */
public final class g extends f {

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteStatement f31822b;

    public g(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f31822b = sQLiteStatement;
    }

    public final void g() {
        this.f31822b.executeUpdateDelete();
    }
}
