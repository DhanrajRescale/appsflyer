package j8;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import androidx.work.g0;
import androidx.work.u;
import com.bumptech.glide.Registry$MissingComponentException;
import ek.b0;
import ek.c0;
import ek.w;
import ek.x;
import ek.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import l7.s;
import l7.t;
import t.j0;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Object f21093a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21094b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f21095c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f21096d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f21097e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f21098f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f21099g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f21100h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f21101i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f21102j;

    public m(Context context) {
        Resources resources = context.getResources();
        Locale locale = (resources == null || resources.getConfiguration() == null || resources.getConfiguration().locale == null) ? Locale.getDefault() : resources.getConfiguration().locale;
        HashMap hashMap = new HashMap();
        hashMap.put("error_initializing_player", "An error occurred while initializing the YouTube player.");
        hashMap.put("get_youtube_app_title", "Get YouTube App");
        hashMap.put("get_youtube_app_text", "This app won't run without the YouTube App, which is missing from your device");
        hashMap.put("get_youtube_app_action", "Get YouTube App");
        hashMap.put("enable_youtube_app_title", "Enable YouTube App");
        hashMap.put("enable_youtube_app_text", "This app won't work unless you enable the YouTube App.");
        hashMap.put("enable_youtube_app_action", "Enable YouTube App");
        hashMap.put("update_youtube_app_title", "Update YouTube App");
        hashMap.put("update_youtube_app_text", "This app won't work unless you update the YouTube App.");
        hashMap.put("update_youtube_app_action", "Update YouTube App");
        dp.b.v0(locale.getLanguage(), hashMap);
        String valueOf = String.valueOf(locale.getLanguage());
        String valueOf2 = String.valueOf(locale.getCountry());
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + valueOf.length() + 1);
        sb2.append(valueOf);
        sb2.append("_");
        sb2.append(valueOf2);
        dp.b.v0(sb2.toString(), hashMap);
        this.f21093a = (String) hashMap.get("error_initializing_player");
        this.f21094b = (String) hashMap.get("get_youtube_app_title");
        this.f21095c = (String) hashMap.get("get_youtube_app_text");
        this.f21096d = (String) hashMap.get("get_youtube_app_action");
        this.f21097e = (String) hashMap.get("enable_youtube_app_title");
        this.f21098f = (String) hashMap.get("enable_youtube_app_text");
        this.f21099g = (String) hashMap.get("enable_youtube_app_action");
        this.f21100h = (String) hashMap.get("update_youtube_app_title");
        this.f21101i = (String) hashMap.get("update_youtube_app_text");
        this.f21102j = (String) hashMap.get("update_youtube_app_action");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [t.j0] */
    /* JADX WARN: Type inference failed for: r0v7, types: [t.j0, t.f] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [t.j0] */
    public final void a(t.f fVar) {
        ArrayList arrayList;
        t.c cVar = (t.c) fVar.keySet();
        t.f fVar2 = cVar.f34842a;
        if (fVar2.isEmpty()) {
            return;
        }
        if (fVar.f34873c > 999) {
            ?? j0Var = new j0(999);
            int i10 = fVar.f34873c;
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                j0Var.put((String) fVar.f(i11), (ArrayList) fVar.j(i11));
                i11++;
                i12++;
                if (i12 == 999) {
                    a(j0Var);
                    j0Var = new j0(999);
                    i12 = 0;
                }
            }
            if (i12 > 0) {
                a(j0Var);
                return;
            }
            return;
        }
        StringBuilder p10 = da.e.p("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int i13 = fVar2.f34873c;
        al.d.N(i13, p10);
        p10.append(")");
        t a10 = t.a(i13, p10.toString());
        Iterator it = cVar.iterator();
        int i14 = 1;
        while (true) {
            t.i iVar = (t.i) it;
            if (!iVar.hasNext()) {
                break;
            }
            String str = (String) iVar.next();
            if (str == null) {
                a10.c(i14);
            } else {
                a10.d(i14, str);
            }
            i14++;
        }
        Cursor P = yk.g.P((s) this.f21093a, a10, false);
        try {
            int columnIndex = P.getColumnIndex("work_spec_id");
            if (columnIndex < 0) {
                columnIndex = P.getColumnIndex("`work_spec_id`");
            }
            if (columnIndex == -1) {
                return;
            }
            while (P.moveToNext()) {
                if (!P.isNull(columnIndex) && (arrayList = (ArrayList) fVar.get(P.getString(columnIndex))) != null) {
                    arrayList.add(androidx.work.k.a(P.getBlob(0)));
                }
            }
        } finally {
            P.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [t.j0] */
    /* JADX WARN: Type inference failed for: r0v7, types: [t.j0, t.f] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [t.j0] */
    public final void b(t.f fVar) {
        ArrayList arrayList;
        t.c cVar = (t.c) fVar.keySet();
        t.f fVar2 = cVar.f34842a;
        if (fVar2.isEmpty()) {
            return;
        }
        if (fVar.f34873c > 999) {
            ?? j0Var = new j0(999);
            int i10 = fVar.f34873c;
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                j0Var.put((String) fVar.f(i11), (ArrayList) fVar.j(i11));
                i11++;
                i12++;
                if (i12 == 999) {
                    b(j0Var);
                    j0Var = new j0(999);
                    i12 = 0;
                }
            }
            if (i12 > 0) {
                b(j0Var);
                return;
            }
            return;
        }
        StringBuilder p10 = da.e.p("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int i13 = fVar2.f34873c;
        al.d.N(i13, p10);
        p10.append(")");
        t a10 = t.a(i13, p10.toString());
        Iterator it = cVar.iterator();
        int i14 = 1;
        while (true) {
            t.i iVar = (t.i) it;
            if (!iVar.hasNext()) {
                break;
            }
            String str = (String) iVar.next();
            if (str == null) {
                a10.c(i14);
            } else {
                a10.d(i14, str);
            }
            i14++;
        }
        Cursor P = yk.g.P((s) this.f21093a, a10, false);
        try {
            int columnIndex = P.getColumnIndex("work_spec_id");
            if (columnIndex < 0) {
                columnIndex = P.getColumnIndex("`work_spec_id`");
            }
            if (columnIndex == -1) {
                return;
            }
            while (P.moveToNext()) {
                if (!P.isNull(columnIndex) && (arrayList = (ArrayList) fVar.get(P.getString(columnIndex))) != null) {
                    arrayList.add(P.getString(0));
                }
            }
        } finally {
            P.close();
        }
    }

    public final void c(Class cls, Class cls2, x xVar) {
        da.d dVar = (da.d) this.f21093a;
        synchronized (dVar) {
            c0 c0Var = (c0) dVar.f14276b;
            synchronized (c0Var) {
                b0 b0Var = new b0(cls, cls2, xVar);
                ArrayList arrayList = c0Var.f15574a;
                arrayList.add(arrayList.size(), b0Var);
            }
            ((androidx.work.j) dVar.f14277c).f2616a.clear();
        }
    }

    public final void d(Class cls, xj.c cVar) {
        l9.c cVar2 = (l9.c) this.f21094b;
        synchronized (cVar2) {
            cVar2.f24251a.add(new mk.a(cls, cVar));
        }
    }

    public final void e(Class cls, xj.n nVar) {
        q9.b bVar = (q9.b) this.f21096d;
        synchronized (bVar) {
            bVar.f31867a.add(new mk.d(cls, nVar));
        }
    }

    public final void f(xj.m mVar, Class cls, Class cls2, String str) {
        da.d dVar = (da.d) this.f21095c;
        synchronized (dVar) {
            dVar.q(str).add(new mk.c(cls, cls2, mVar));
        }
    }

    public final ArrayList g() {
        t tVar;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        t a10 = t.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        a10.b(1, 200);
        s sVar = (s) this.f21093a;
        sVar.b();
        Cursor P = yk.g.P(sVar, a10, false);
        try {
            i10 = q6.l.i(P, "required_network_type");
            i11 = q6.l.i(P, "requires_charging");
            i12 = q6.l.i(P, "requires_device_idle");
            i13 = q6.l.i(P, "requires_battery_not_low");
            i14 = q6.l.i(P, "requires_storage_not_low");
            i15 = q6.l.i(P, "trigger_content_update_delay");
            i16 = q6.l.i(P, "trigger_max_content_delay");
            i17 = q6.l.i(P, "content_uri_triggers");
            i18 = q6.l.i(P, "id");
            i19 = q6.l.i(P, "state");
            i20 = q6.l.i(P, "worker_class_name");
            i21 = q6.l.i(P, "input_merger_class_name");
            i22 = q6.l.i(P, "input");
            i23 = q6.l.i(P, "output");
            tVar = a10;
        } catch (Throwable th2) {
            th = th2;
            tVar = a10;
        }
        try {
            int i24 = q6.l.i(P, "initial_delay");
            int i25 = q6.l.i(P, "interval_duration");
            int i26 = q6.l.i(P, "flex_duration");
            int i27 = q6.l.i(P, "run_attempt_count");
            int i28 = q6.l.i(P, "backoff_policy");
            int i29 = q6.l.i(P, "backoff_delay_duration");
            int i30 = q6.l.i(P, "period_start_time");
            int i31 = q6.l.i(P, "minimum_retention_duration");
            int i32 = q6.l.i(P, "schedule_requested_at");
            int i33 = q6.l.i(P, "run_in_foreground");
            int i34 = q6.l.i(P, "out_of_quota_policy");
            int i35 = i23;
            ArrayList arrayList = new ArrayList(P.getCount());
            while (P.moveToNext()) {
                String string = P.getString(i18);
                int i36 = i18;
                String string2 = P.getString(i20);
                int i37 = i20;
                androidx.work.e eVar = new androidx.work.e();
                int i38 = i10;
                eVar.f2552a = yk.g.D(P.getInt(i10));
                if (P.getInt(i11) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                eVar.f2553b = z10;
                if (P.getInt(i12) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                eVar.f2554c = z11;
                if (P.getInt(i13) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                eVar.f2555d = z12;
                if (P.getInt(i14) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                eVar.f2556e = z13;
                int i39 = i11;
                int i40 = i12;
                eVar.f2557f = P.getLong(i15);
                eVar.f2558g = P.getLong(i16);
                eVar.f2559h = yk.g.e(P.getBlob(i17));
                k kVar = new k(string, string2);
                kVar.f21075b = yk.g.F(P.getInt(i19));
                kVar.f21077d = P.getString(i21);
                kVar.f21078e = androidx.work.k.a(P.getBlob(i22));
                int i41 = i35;
                kVar.f21079f = androidx.work.k.a(P.getBlob(i41));
                int i42 = i21;
                int i43 = i24;
                kVar.f21080g = P.getLong(i43);
                i35 = i41;
                int i44 = i22;
                int i45 = i25;
                kVar.f21081h = P.getLong(i45);
                i25 = i45;
                int i46 = i26;
                kVar.f21082i = P.getLong(i46);
                int i47 = i27;
                kVar.f21084k = P.getInt(i47);
                int i48 = i28;
                i27 = i47;
                kVar.f21085l = yk.g.C(P.getInt(i48));
                i26 = i46;
                int i49 = i29;
                kVar.f21086m = P.getLong(i49);
                i29 = i49;
                int i50 = i30;
                kVar.f21087n = P.getLong(i50);
                i30 = i50;
                int i51 = i31;
                kVar.f21088o = P.getLong(i51);
                i31 = i51;
                int i52 = i32;
                kVar.f21089p = P.getLong(i52);
                int i53 = i33;
                if (P.getInt(i53) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                kVar.f21090q = z14;
                int i54 = i34;
                i33 = i53;
                kVar.f21091r = yk.g.E(P.getInt(i54));
                kVar.f21083j = eVar;
                arrayList.add(kVar);
                i34 = i54;
                i32 = i52;
                i21 = i42;
                i11 = i39;
                i18 = i36;
                i20 = i37;
                i10 = i38;
                i24 = i43;
                i12 = i40;
                i28 = i48;
                i22 = i44;
            }
            P.close();
            tVar.release();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            P.close();
            tVar.release();
            throw th;
        }
    }

    public final ArrayList h(int i10) {
        t tVar;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        t a10 = t.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        a10.b(1, i10);
        s sVar = (s) this.f21093a;
        sVar.b();
        Cursor P = yk.g.P(sVar, a10, false);
        try {
            i11 = q6.l.i(P, "required_network_type");
            i12 = q6.l.i(P, "requires_charging");
            i13 = q6.l.i(P, "requires_device_idle");
            i14 = q6.l.i(P, "requires_battery_not_low");
            i15 = q6.l.i(P, "requires_storage_not_low");
            i16 = q6.l.i(P, "trigger_content_update_delay");
            i17 = q6.l.i(P, "trigger_max_content_delay");
            i18 = q6.l.i(P, "content_uri_triggers");
            i19 = q6.l.i(P, "id");
            i20 = q6.l.i(P, "state");
            i21 = q6.l.i(P, "worker_class_name");
            i22 = q6.l.i(P, "input_merger_class_name");
            i23 = q6.l.i(P, "input");
            i24 = q6.l.i(P, "output");
            tVar = a10;
        } catch (Throwable th2) {
            th = th2;
            tVar = a10;
        }
        try {
            int i25 = q6.l.i(P, "initial_delay");
            int i26 = q6.l.i(P, "interval_duration");
            int i27 = q6.l.i(P, "flex_duration");
            int i28 = q6.l.i(P, "run_attempt_count");
            int i29 = q6.l.i(P, "backoff_policy");
            int i30 = q6.l.i(P, "backoff_delay_duration");
            int i31 = q6.l.i(P, "period_start_time");
            int i32 = q6.l.i(P, "minimum_retention_duration");
            int i33 = q6.l.i(P, "schedule_requested_at");
            int i34 = q6.l.i(P, "run_in_foreground");
            int i35 = q6.l.i(P, "out_of_quota_policy");
            int i36 = i24;
            ArrayList arrayList = new ArrayList(P.getCount());
            while (P.moveToNext()) {
                String string = P.getString(i19);
                int i37 = i19;
                String string2 = P.getString(i21);
                int i38 = i21;
                androidx.work.e eVar = new androidx.work.e();
                int i39 = i11;
                eVar.f2552a = yk.g.D(P.getInt(i11));
                if (P.getInt(i12) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                eVar.f2553b = z10;
                if (P.getInt(i13) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                eVar.f2554c = z11;
                if (P.getInt(i14) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                eVar.f2555d = z12;
                if (P.getInt(i15) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                eVar.f2556e = z13;
                int i40 = i12;
                int i41 = i13;
                eVar.f2557f = P.getLong(i16);
                eVar.f2558g = P.getLong(i17);
                eVar.f2559h = yk.g.e(P.getBlob(i18));
                k kVar = new k(string, string2);
                kVar.f21075b = yk.g.F(P.getInt(i20));
                kVar.f21077d = P.getString(i22);
                kVar.f21078e = androidx.work.k.a(P.getBlob(i23));
                int i42 = i36;
                kVar.f21079f = androidx.work.k.a(P.getBlob(i42));
                int i43 = i22;
                int i44 = i25;
                kVar.f21080g = P.getLong(i44);
                i36 = i42;
                int i45 = i23;
                int i46 = i26;
                kVar.f21081h = P.getLong(i46);
                i26 = i46;
                int i47 = i27;
                kVar.f21082i = P.getLong(i47);
                int i48 = i28;
                kVar.f21084k = P.getInt(i48);
                int i49 = i29;
                i28 = i48;
                kVar.f21085l = yk.g.C(P.getInt(i49));
                i27 = i47;
                int i50 = i30;
                kVar.f21086m = P.getLong(i50);
                i30 = i50;
                int i51 = i31;
                kVar.f21087n = P.getLong(i51);
                i31 = i51;
                int i52 = i32;
                kVar.f21088o = P.getLong(i52);
                i32 = i52;
                int i53 = i33;
                kVar.f21089p = P.getLong(i53);
                int i54 = i34;
                if (P.getInt(i54) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                kVar.f21090q = z14;
                int i55 = i35;
                i34 = i54;
                kVar.f21091r = yk.g.E(P.getInt(i55));
                kVar.f21083j = eVar;
                arrayList.add(kVar);
                i35 = i55;
                i33 = i53;
                i22 = i43;
                i12 = i40;
                i19 = i37;
                i21 = i38;
                i11 = i39;
                i25 = i44;
                i13 = i41;
                i29 = i49;
                i23 = i45;
            }
            P.close();
            tVar.release();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            P.close();
            tVar.release();
            throw th;
        }
    }

    public final List i() {
        List list;
        q9.b bVar = (q9.b) this.f21099g;
        synchronized (bVar) {
            list = bVar.f31867a;
        }
        if (!list.isEmpty()) {
            return list;
        }
        throw new Registry$MissingComponentException() { // from class: com.bumptech.glide.Registry$NoImageHeaderParserException
        };
    }

    public final List j(Object obj) {
        List list;
        da.d dVar = (da.d) this.f21093a;
        dVar.getClass();
        Class<?> cls = obj.getClass();
        synchronized (dVar) {
            y yVar = (y) ((androidx.work.j) dVar.f14277c).f2616a.get(cls);
            if (yVar == null) {
                list = null;
            } else {
                list = yVar.f15631a;
            }
            if (list == null) {
                list = Collections.unmodifiableList(((c0) dVar.f14276b).b(cls));
                if (((y) ((androidx.work.j) dVar.f14277c).f2616a.put(cls, new y(list))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            List emptyList = Collections.emptyList();
            boolean z10 = true;
            for (int i10 = 0; i10 < size; i10++) {
                w wVar = (w) list.get(i10);
                if (wVar.a(obj)) {
                    if (z10) {
                        emptyList = new ArrayList(size - i10);
                        z10 = false;
                    }
                    emptyList.add(wVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new RuntimeException("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
        }
        throw new RuntimeException("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
    }

    public final ArrayList k() {
        t tVar;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        t a10 = t.a(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        s sVar = (s) this.f21093a;
        sVar.b();
        Cursor P = yk.g.P(sVar, a10, false);
        try {
            i10 = q6.l.i(P, "required_network_type");
            i11 = q6.l.i(P, "requires_charging");
            i12 = q6.l.i(P, "requires_device_idle");
            i13 = q6.l.i(P, "requires_battery_not_low");
            i14 = q6.l.i(P, "requires_storage_not_low");
            i15 = q6.l.i(P, "trigger_content_update_delay");
            i16 = q6.l.i(P, "trigger_max_content_delay");
            i17 = q6.l.i(P, "content_uri_triggers");
            i18 = q6.l.i(P, "id");
            i19 = q6.l.i(P, "state");
            i20 = q6.l.i(P, "worker_class_name");
            i21 = q6.l.i(P, "input_merger_class_name");
            i22 = q6.l.i(P, "input");
            i23 = q6.l.i(P, "output");
            tVar = a10;
        } catch (Throwable th2) {
            th = th2;
            tVar = a10;
        }
        try {
            int i24 = q6.l.i(P, "initial_delay");
            int i25 = q6.l.i(P, "interval_duration");
            int i26 = q6.l.i(P, "flex_duration");
            int i27 = q6.l.i(P, "run_attempt_count");
            int i28 = q6.l.i(P, "backoff_policy");
            int i29 = q6.l.i(P, "backoff_delay_duration");
            int i30 = q6.l.i(P, "period_start_time");
            int i31 = q6.l.i(P, "minimum_retention_duration");
            int i32 = q6.l.i(P, "schedule_requested_at");
            int i33 = q6.l.i(P, "run_in_foreground");
            int i34 = q6.l.i(P, "out_of_quota_policy");
            int i35 = i23;
            ArrayList arrayList = new ArrayList(P.getCount());
            while (P.moveToNext()) {
                String string = P.getString(i18);
                int i36 = i18;
                String string2 = P.getString(i20);
                int i37 = i20;
                androidx.work.e eVar = new androidx.work.e();
                int i38 = i10;
                eVar.f2552a = yk.g.D(P.getInt(i10));
                if (P.getInt(i11) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                eVar.f2553b = z10;
                if (P.getInt(i12) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                eVar.f2554c = z11;
                if (P.getInt(i13) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                eVar.f2555d = z12;
                if (P.getInt(i14) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                eVar.f2556e = z13;
                int i39 = i11;
                int i40 = i12;
                eVar.f2557f = P.getLong(i15);
                eVar.f2558g = P.getLong(i16);
                eVar.f2559h = yk.g.e(P.getBlob(i17));
                k kVar = new k(string, string2);
                kVar.f21075b = yk.g.F(P.getInt(i19));
                kVar.f21077d = P.getString(i21);
                kVar.f21078e = androidx.work.k.a(P.getBlob(i22));
                int i41 = i35;
                kVar.f21079f = androidx.work.k.a(P.getBlob(i41));
                int i42 = i22;
                int i43 = i24;
                kVar.f21080g = P.getLong(i43);
                int i44 = i13;
                int i45 = i25;
                kVar.f21081h = P.getLong(i45);
                int i46 = i26;
                kVar.f21082i = P.getLong(i46);
                int i47 = i27;
                kVar.f21084k = P.getInt(i47);
                int i48 = i28;
                kVar.f21085l = yk.g.C(P.getInt(i48));
                int i49 = i29;
                kVar.f21086m = P.getLong(i49);
                int i50 = i30;
                kVar.f21087n = P.getLong(i50);
                int i51 = i31;
                kVar.f21088o = P.getLong(i51);
                int i52 = i32;
                kVar.f21089p = P.getLong(i52);
                int i53 = i33;
                if (P.getInt(i53) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                kVar.f21090q = z14;
                int i54 = i34;
                kVar.f21091r = yk.g.E(P.getInt(i54));
                kVar.f21083j = eVar;
                arrayList.add(kVar);
                i35 = i41;
                i11 = i39;
                i24 = i43;
                i25 = i45;
                i29 = i49;
                i30 = i50;
                i33 = i53;
                i20 = i37;
                i10 = i38;
                i34 = i54;
                i32 = i52;
                i22 = i42;
                i18 = i36;
                i12 = i40;
                i31 = i51;
                i13 = i44;
                i26 = i46;
                i27 = i47;
                i28 = i48;
            }
            P.close();
            tVar.release();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            P.close();
            tVar.release();
            throw th;
        }
    }

    public final ArrayList l() {
        t tVar;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        t a10 = t.a(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        s sVar = (s) this.f21093a;
        sVar.b();
        Cursor P = yk.g.P(sVar, a10, false);
        try {
            i10 = q6.l.i(P, "required_network_type");
            i11 = q6.l.i(P, "requires_charging");
            i12 = q6.l.i(P, "requires_device_idle");
            i13 = q6.l.i(P, "requires_battery_not_low");
            i14 = q6.l.i(P, "requires_storage_not_low");
            i15 = q6.l.i(P, "trigger_content_update_delay");
            i16 = q6.l.i(P, "trigger_max_content_delay");
            i17 = q6.l.i(P, "content_uri_triggers");
            i18 = q6.l.i(P, "id");
            i19 = q6.l.i(P, "state");
            i20 = q6.l.i(P, "worker_class_name");
            i21 = q6.l.i(P, "input_merger_class_name");
            i22 = q6.l.i(P, "input");
            i23 = q6.l.i(P, "output");
            tVar = a10;
        } catch (Throwable th2) {
            th = th2;
            tVar = a10;
        }
        try {
            int i24 = q6.l.i(P, "initial_delay");
            int i25 = q6.l.i(P, "interval_duration");
            int i26 = q6.l.i(P, "flex_duration");
            int i27 = q6.l.i(P, "run_attempt_count");
            int i28 = q6.l.i(P, "backoff_policy");
            int i29 = q6.l.i(P, "backoff_delay_duration");
            int i30 = q6.l.i(P, "period_start_time");
            int i31 = q6.l.i(P, "minimum_retention_duration");
            int i32 = q6.l.i(P, "schedule_requested_at");
            int i33 = q6.l.i(P, "run_in_foreground");
            int i34 = q6.l.i(P, "out_of_quota_policy");
            int i35 = i23;
            ArrayList arrayList = new ArrayList(P.getCount());
            while (P.moveToNext()) {
                String string = P.getString(i18);
                int i36 = i18;
                String string2 = P.getString(i20);
                int i37 = i20;
                androidx.work.e eVar = new androidx.work.e();
                int i38 = i10;
                eVar.f2552a = yk.g.D(P.getInt(i10));
                if (P.getInt(i11) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                eVar.f2553b = z10;
                if (P.getInt(i12) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                eVar.f2554c = z11;
                if (P.getInt(i13) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                eVar.f2555d = z12;
                if (P.getInt(i14) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                eVar.f2556e = z13;
                int i39 = i11;
                int i40 = i12;
                eVar.f2557f = P.getLong(i15);
                eVar.f2558g = P.getLong(i16);
                eVar.f2559h = yk.g.e(P.getBlob(i17));
                k kVar = new k(string, string2);
                kVar.f21075b = yk.g.F(P.getInt(i19));
                kVar.f21077d = P.getString(i21);
                kVar.f21078e = androidx.work.k.a(P.getBlob(i22));
                int i41 = i35;
                kVar.f21079f = androidx.work.k.a(P.getBlob(i41));
                int i42 = i22;
                int i43 = i24;
                kVar.f21080g = P.getLong(i43);
                int i44 = i13;
                int i45 = i25;
                kVar.f21081h = P.getLong(i45);
                int i46 = i26;
                kVar.f21082i = P.getLong(i46);
                int i47 = i27;
                kVar.f21084k = P.getInt(i47);
                int i48 = i28;
                kVar.f21085l = yk.g.C(P.getInt(i48));
                int i49 = i29;
                kVar.f21086m = P.getLong(i49);
                int i50 = i30;
                kVar.f21087n = P.getLong(i50);
                int i51 = i31;
                kVar.f21088o = P.getLong(i51);
                int i52 = i32;
                kVar.f21089p = P.getLong(i52);
                int i53 = i33;
                if (P.getInt(i53) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                kVar.f21090q = z14;
                int i54 = i34;
                kVar.f21091r = yk.g.E(P.getInt(i54));
                kVar.f21083j = eVar;
                arrayList.add(kVar);
                i35 = i41;
                i11 = i39;
                i24 = i43;
                i25 = i45;
                i29 = i49;
                i30 = i50;
                i33 = i53;
                i20 = i37;
                i10 = i38;
                i34 = i54;
                i32 = i52;
                i22 = i42;
                i18 = i36;
                i12 = i40;
                i31 = i51;
                i13 = i44;
                i26 = i46;
                i27 = i47;
                i28 = i48;
            }
            P.close();
            tVar.release();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            P.close();
            tVar.release();
            throw th;
        }
    }

    public final g0 m(String str) {
        g0 g0Var;
        t a10 = t.a(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            a10.c(1);
        } else {
            a10.d(1, str);
        }
        s sVar = (s) this.f21093a;
        sVar.b();
        Cursor P = yk.g.P(sVar, a10, false);
        try {
            if (P.moveToFirst()) {
                g0Var = yk.g.F(P.getInt(0));
            } else {
                g0Var = null;
            }
            return g0Var;
        } finally {
            P.close();
            a10.release();
        }
    }

    public final ArrayList n(String str) {
        t a10 = t.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            a10.c(1);
        } else {
            a10.d(1, str);
        }
        s sVar = (s) this.f21093a;
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

    public final k o(String str) {
        t tVar;
        k kVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        t a10 = t.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            a10.c(1);
        } else {
            a10.d(1, str);
        }
        s sVar = (s) this.f21093a;
        sVar.b();
        Cursor P = yk.g.P(sVar, a10, false);
        try {
            int i10 = q6.l.i(P, "required_network_type");
            int i11 = q6.l.i(P, "requires_charging");
            int i12 = q6.l.i(P, "requires_device_idle");
            int i13 = q6.l.i(P, "requires_battery_not_low");
            int i14 = q6.l.i(P, "requires_storage_not_low");
            int i15 = q6.l.i(P, "trigger_content_update_delay");
            int i16 = q6.l.i(P, "trigger_max_content_delay");
            int i17 = q6.l.i(P, "content_uri_triggers");
            int i18 = q6.l.i(P, "id");
            int i19 = q6.l.i(P, "state");
            int i20 = q6.l.i(P, "worker_class_name");
            int i21 = q6.l.i(P, "input_merger_class_name");
            int i22 = q6.l.i(P, "input");
            int i23 = q6.l.i(P, "output");
            tVar = a10;
            try {
                int i24 = q6.l.i(P, "initial_delay");
                int i25 = q6.l.i(P, "interval_duration");
                int i26 = q6.l.i(P, "flex_duration");
                int i27 = q6.l.i(P, "run_attempt_count");
                int i28 = q6.l.i(P, "backoff_policy");
                int i29 = q6.l.i(P, "backoff_delay_duration");
                int i30 = q6.l.i(P, "period_start_time");
                int i31 = q6.l.i(P, "minimum_retention_duration");
                int i32 = q6.l.i(P, "schedule_requested_at");
                int i33 = q6.l.i(P, "run_in_foreground");
                int i34 = q6.l.i(P, "out_of_quota_policy");
                if (P.moveToFirst()) {
                    String string = P.getString(i18);
                    String string2 = P.getString(i20);
                    androidx.work.e eVar = new androidx.work.e();
                    eVar.f2552a = yk.g.D(P.getInt(i10));
                    if (P.getInt(i11) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    eVar.f2553b = z10;
                    if (P.getInt(i12) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    eVar.f2554c = z11;
                    if (P.getInt(i13) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    eVar.f2555d = z12;
                    if (P.getInt(i14) != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    eVar.f2556e = z13;
                    eVar.f2557f = P.getLong(i15);
                    eVar.f2558g = P.getLong(i16);
                    eVar.f2559h = yk.g.e(P.getBlob(i17));
                    kVar = new k(string, string2);
                    kVar.f21075b = yk.g.F(P.getInt(i19));
                    kVar.f21077d = P.getString(i21);
                    kVar.f21078e = androidx.work.k.a(P.getBlob(i22));
                    kVar.f21079f = androidx.work.k.a(P.getBlob(i23));
                    kVar.f21080g = P.getLong(i24);
                    kVar.f21081h = P.getLong(i25);
                    kVar.f21082i = P.getLong(i26);
                    kVar.f21084k = P.getInt(i27);
                    kVar.f21085l = yk.g.C(P.getInt(i28));
                    kVar.f21086m = P.getLong(i29);
                    kVar.f21087n = P.getLong(i30);
                    kVar.f21088o = P.getLong(i31);
                    kVar.f21089p = P.getLong(i32);
                    if (P.getInt(i33) != 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    kVar.f21090q = z14;
                    kVar.f21091r = yk.g.E(P.getInt(i34));
                    kVar.f21083j = eVar;
                } else {
                    kVar = null;
                }
                P.close();
                tVar.release();
                return kVar;
            } catch (Throwable th2) {
                th = th2;
                P.close();
                tVar.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            tVar = a10;
        }
    }

    public final boolean p() {
        boolean z10 = false;
        t a10 = t.a(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
        s sVar = (s) this.f21093a;
        sVar.b();
        Cursor P = yk.g.P(sVar, a10, false);
        try {
            if (P.moveToFirst()) {
                if (P.getInt(0) != 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            P.close();
            a10.release();
        }
    }

    public final void q(String str) {
        Object obj = this.f21093a;
        s sVar = (s) obj;
        sVar.b();
        l7.x xVar = (l7.x) this.f21098f;
        q7.g a10 = xVar.a();
        if (str == null) {
            a10.d(1);
        } else {
            a10.f(1, str);
        }
        sVar.c();
        try {
            a10.f31822b.executeUpdateDelete();
            ((s) obj).h();
        } finally {
            sVar.f();
            xVar.c(a10);
        }
    }

    public final void r(long j10, String str) {
        Object obj = this.f21093a;
        s sVar = (s) obj;
        sVar.b();
        l7.x xVar = (l7.x) this.f21100h;
        q7.g a10 = xVar.a();
        a10.c(1, j10);
        if (str == null) {
            a10.d(2);
        } else {
            a10.f(2, str);
        }
        sVar.c();
        try {
            a10.f31822b.executeUpdateDelete();
            ((s) obj).h();
        } finally {
            sVar.f();
            xVar.c(a10);
        }
    }

    public final void s(Class cls, Class cls2, kk.a aVar) {
        q9.b bVar = (q9.b) this.f21098f;
        synchronized (bVar) {
            bVar.f31867a.add(new kk.b(cls, cls2, aVar));
        }
    }

    public final void t(yj.f fVar) {
        yj.i iVar = (yj.i) this.f21097e;
        synchronized (iVar) {
            iVar.f41660a.put(fVar.a(), fVar);
        }
    }

    public final void u(String str) {
        Object obj = this.f21093a;
        s sVar = (s) obj;
        sVar.b();
        l7.x xVar = (l7.x) this.f21099g;
        q7.g a10 = xVar.a();
        if (str == null) {
            a10.d(1);
        } else {
            a10.f(1, str);
        }
        sVar.c();
        try {
            a10.f31822b.executeUpdateDelete();
            ((s) obj).h();
        } finally {
            sVar.f();
            xVar.c(a10);
        }
    }

    public final void v(String str, androidx.work.k kVar) {
        Object obj = this.f21093a;
        s sVar = (s) obj;
        sVar.b();
        l7.x xVar = (l7.x) this.f21096d;
        q7.g a10 = xVar.a();
        byte[] c10 = androidx.work.k.c(kVar);
        if (c10 == null) {
            a10.d(1);
        } else {
            a10.a(1, c10);
        }
        if (str == null) {
            a10.d(2);
        } else {
            a10.f(2, str);
        }
        sVar.c();
        try {
            a10.g();
            ((s) obj).h();
        } finally {
            sVar.f();
            xVar.c(a10);
        }
    }

    public final void w(long j10, String str) {
        Object obj = this.f21093a;
        s sVar = (s) obj;
        sVar.b();
        l7.x xVar = (l7.x) this.f21097e;
        q7.g a10 = xVar.a();
        a10.c(1, j10);
        if (str == null) {
            a10.d(2);
        } else {
            a10.f(2, str);
        }
        sVar.c();
        try {
            a10.g();
            ((s) obj).h();
        } finally {
            sVar.f();
            xVar.c(a10);
        }
    }

    public final void x(g0 g0Var, String... strArr) {
        Object obj = this.f21093a;
        s sVar = (s) obj;
        sVar.b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE workspec SET state=? WHERE id IN (");
        al.d.N(strArr.length, sb2);
        sb2.append(")");
        String sb3 = sb2.toString();
        sVar.a();
        sVar.b();
        q7.g gVar = new q7.g(((q7.b) sVar.f24162d.A()).f31808a.compileStatement(sb3));
        gVar.c(1, yk.g.b0(g0Var));
        int i10 = 2;
        for (String str : strArr) {
            if (str == null) {
                gVar.d(i10);
            } else {
                gVar.f(i10, str);
            }
            i10++;
        }
        sVar.c();
        try {
            gVar.f31822b.executeUpdateDelete();
            ((s) obj).h();
        } finally {
            sVar.f();
        }
    }

    public m(s sVar) {
        this.f21093a = sVar;
        this.f21094b = new b(this, sVar, 5);
        this.f21095c = new l(sVar, 0);
        this.f21096d = new l(sVar, 1);
        this.f21097e = new l(sVar, 2);
        this.f21098f = new l(sVar, 3);
        this.f21099g = new l(sVar, 4);
        this.f21100h = new l(sVar, 5);
        this.f21101i = new l(sVar, 6);
        this.f21102j = new l(sVar, 7);
    }

    public m(pp.g gVar, nq.d dVar, jr.i iVar, jr.d dVar2, Context context, String str, jr.l lVar, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f21093a = linkedHashSet;
        this.f21094b = new jr.n(gVar, dVar, iVar, dVar2, context, str, linkedHashSet, lVar, scheduledExecutorService);
        this.f21096d = gVar;
        this.f21095c = iVar;
        this.f21097e = dVar;
        this.f21098f = dVar2;
        this.f21099g = context;
        this.f21100h = str;
        this.f21101i = lVar;
        this.f21102j = scheduledExecutorService;
    }

    public m() {
        this.f21100h = new da.d(17);
        this.f21101i = new mk.b();
        int i10 = 9;
        x9.c cVar = new x9.c(new c4.f(20), new ek.e(i10), new u(i10), 7);
        this.f21102j = cVar;
        this.f21093a = new da.d((c4.e) cVar);
        int i11 = 1;
        this.f21094b = new l9.c(i11);
        da.d dVar = new da.d(18);
        this.f21095c = dVar;
        this.f21096d = new q9.b(2);
        this.f21097e = new yj.i();
        this.f21098f = new q9.b(i11);
        this.f21099g = new q9.b();
        List asList = Arrays.asList("Gif", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.addAll(asList);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        synchronized (dVar) {
            try {
                ArrayList arrayList2 = new ArrayList((List) dVar.f14276b);
                ((List) dVar.f14276b).clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((List) dVar.f14276b).add((String) it.next());
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    if (!arrayList.contains(str)) {
                        ((List) dVar.f14276b).add(str);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
