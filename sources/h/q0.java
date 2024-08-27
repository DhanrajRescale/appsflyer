package h;

import android.database.Cursor;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class q0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17730a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17731b;

    public /* synthetic */ q0(Object obj, int i10) {
        this.f17730a = i10;
        this.f17731b = obj;
    }

    public final HashSet a() {
        HashSet hashSet = new HashSet();
        Cursor g10 = ((l7.k) this.f17731b).f24131d.g(new tr.e("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
        while (g10.moveToNext()) {
            try {
                hashSet.add(Integer.valueOf(g10.getInt(0)));
            } catch (Throwable th2) {
                g10.close();
                throw th2;
            }
        }
        g10.close();
        if (!hashSet.isEmpty()) {
            ((l7.k) this.f17731b).f24134g.g();
        }
        return hashSet;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:286:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:450:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.q0.run():void");
    }
}
