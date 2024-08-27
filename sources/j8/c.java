package j8;

import android.database.Cursor;
import java.util.ArrayList;
import l7.s;
import l7.t;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final s f21053a;

    /* renamed from: b, reason: collision with root package name */
    public final b f21054b;

    public c(s sVar, int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    this.f21053a = sVar;
                    this.f21054b = new b(this, sVar, 0);
                    return;
                } else {
                    this.f21053a = sVar;
                    this.f21054b = new b(this, sVar, 6);
                    return;
                }
            }
            this.f21053a = sVar;
            this.f21054b = new b(this, sVar, 3);
            return;
        }
        this.f21053a = sVar;
        this.f21054b = new b(this, sVar, 1);
    }

    public final ArrayList a(String str) {
        t a10 = t.a(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            a10.c(1);
        } else {
            a10.d(1, str);
        }
        s sVar = this.f21053a;
        sVar.b();
        Cursor P = yk.g.P(sVar, a10, false);
        try {
            ArrayList arrayList = new ArrayList(P.getCount());
            while (P.moveToNext()) {
                arrayList.add(P.getString(0));
            }
            return arrayList;
        } finally {
            P.close();
            a10.release();
        }
    }

    public final Long b(String str) {
        t a10 = t.a(1, "SELECT long_value FROM Preference where `key`=?");
        a10.d(1, str);
        s sVar = this.f21053a;
        sVar.b();
        Cursor P = yk.g.P(sVar, a10, false);
        try {
            Long l10 = null;
            if (P.moveToFirst() && !P.isNull(0)) {
                l10 = Long.valueOf(P.getLong(0));
            }
            return l10;
        } finally {
            P.close();
            a10.release();
        }
    }

    public final ArrayList c(String str) {
        t a10 = t.a(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            a10.c(1);
        } else {
            a10.d(1, str);
        }
        s sVar = this.f21053a;
        sVar.b();
        Cursor P = yk.g.P(sVar, a10, false);
        try {
            ArrayList arrayList = new ArrayList(P.getCount());
            while (P.moveToNext()) {
                arrayList.add(P.getString(0));
            }
            return arrayList;
        } finally {
            P.close();
            a10.release();
        }
    }

    public final boolean d(String str) {
        boolean z10 = true;
        t a10 = t.a(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            a10.c(1);
        } else {
            a10.d(1, str);
        }
        s sVar = this.f21053a;
        sVar.b();
        boolean z11 = false;
        Cursor P = yk.g.P(sVar, a10, false);
        try {
            if (P.moveToFirst()) {
                if (P.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            return z11;
        } finally {
            P.close();
            a10.release();
        }
    }

    public final void e(d dVar) {
        s sVar = this.f21053a;
        sVar.b();
        sVar.c();
        try {
            this.f21054b.e(dVar);
            sVar.h();
        } finally {
            sVar.f();
        }
    }
}
