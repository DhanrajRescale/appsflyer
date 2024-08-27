package aq;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f2753a;

    /* renamed from: b, reason: collision with root package name */
    public final Logger f2754b;

    public q(Context context, String str) {
        Preconditions.checkNotNull(context);
        this.f2753a = context.getApplicationContext().getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", Preconditions.checkNotEmpty(str)), 0);
        this.f2754b = new Logger("StorageHelpers", new String[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9 A[Catch: zzvz -> 0x007c, IllegalArgumentException -> 0x0081, ArrayIndexOutOfBoundsException -> 0x0083, JSONException -> 0x0085, TRY_ENTER, TryCatch #2 {JSONException -> 0x0085, blocks: (B:3:0x0007, B:6:0x0024, B:10:0x003a, B:13:0x0076, B:16:0x0088, B:17:0x0094, B:20:0x0095, B:22:0x00a4, B:24:0x00b2, B:25:0x00b6, B:27:0x00be, B:31:0x00d9, B:36:0x00db, B:38:0x00e1, B:40:0x00e7, B:41:0x00ed, B:43:0x00f3, B:46:0x010e, B:48:0x0114, B:50:0x0167, B:52:0x012b, B:53:0x0132, B:57:0x0139, B:62:0x0142, B:64:0x0148, B:66:0x0154, B:69:0x016d, B:70:0x0174, B:72:0x0175, B:73:0x017c, B:75:0x017d), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final aq.g0 a(org.json.JSONObject r27) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: aq.q.a(org.json.JSONObject):aq.g0");
    }
}
