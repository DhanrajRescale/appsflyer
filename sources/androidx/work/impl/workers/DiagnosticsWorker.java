package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.u;
import b8.l;
import j8.c;
import j8.e;
import j8.k;
import j8.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import l7.s;
import l7.t;
import yk.g;

/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* renamed from: b, reason: collision with root package name */
    public static final String f2615b = u.C("DiagnosticsWrkr");

    public DiagnosticsWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String b(c cVar, c cVar2, h.c cVar3, ArrayList arrayList) {
        Integer num;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", "Job Id"));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            e E = cVar3.E(kVar.f21074a);
            if (E != null) {
                num = Integer.valueOf(E.f21058b);
            } else {
                num = null;
            }
            Integer num2 = num;
            String str = kVar.f21074a;
            cVar.getClass();
            t a10 = t.a(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str == null) {
                a10.c(1);
            } else {
                a10.d(1, str);
            }
            s sVar = cVar.f21053a;
            sVar.b();
            Cursor P = g.P(sVar, a10, false);
            try {
                ArrayList arrayList2 = new ArrayList(P.getCount());
                while (P.moveToNext()) {
                    arrayList2.add(P.getString(0));
                }
                P.close();
                a10.release();
                ArrayList c10 = cVar2.c(kVar.f21074a);
                sb2.append(String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", kVar.f21074a, kVar.f21076c, num2, kVar.f21075b.name(), TextUtils.join(",", arrayList2), TextUtils.join(",", c10)));
            } catch (Throwable th2) {
                P.close();
                a10.release();
                throw th2;
            }
        }
        return sb2.toString();
    }

    @Override // androidx.work.Worker
    public final androidx.work.t a() {
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
        h.c cVar;
        c cVar2;
        c cVar3;
        int i24;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        WorkDatabase workDatabase = l.c(getApplicationContext()).f4110c;
        m n10 = workDatabase.n();
        c l10 = workDatabase.l();
        c o10 = workDatabase.o();
        h.c k10 = workDatabase.k();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        n10.getClass();
        t a10 = t.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        a10.b(1, currentTimeMillis);
        s sVar = (s) n10.f21093a;
        sVar.b();
        Cursor P = g.P(sVar, a10, false);
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
            int i36 = i23;
            ArrayList arrayList = new ArrayList(P.getCount());
            while (P.moveToNext()) {
                String string = P.getString(i18);
                int i37 = i18;
                String string2 = P.getString(i20);
                int i38 = i20;
                androidx.work.e eVar = new androidx.work.e();
                int i39 = i10;
                eVar.f2552a = g.D(P.getInt(i10));
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
                int i40 = i11;
                eVar.f2557f = P.getLong(i15);
                eVar.f2558g = P.getLong(i16);
                eVar.f2559h = g.e(P.getBlob(i17));
                k kVar = new k(string, string2);
                kVar.f21075b = g.F(P.getInt(i19));
                kVar.f21077d = P.getString(i21);
                kVar.f21078e = androidx.work.k.a(P.getBlob(i22));
                int i41 = i36;
                kVar.f21079f = androidx.work.k.a(P.getBlob(i41));
                i36 = i41;
                int i42 = i21;
                int i43 = i25;
                kVar.f21080g = P.getLong(i43);
                int i44 = i22;
                int i45 = i26;
                kVar.f21081h = P.getLong(i45);
                int i46 = i19;
                int i47 = i27;
                kVar.f21082i = P.getLong(i47);
                int i48 = i28;
                kVar.f21084k = P.getInt(i48);
                int i49 = i29;
                kVar.f21085l = g.C(P.getInt(i49));
                i27 = i47;
                int i50 = i30;
                kVar.f21086m = P.getLong(i50);
                int i51 = i31;
                kVar.f21087n = P.getLong(i51);
                i31 = i51;
                int i52 = i32;
                kVar.f21088o = P.getLong(i52);
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
                kVar.f21091r = g.E(P.getInt(i55));
                kVar.f21083j = eVar;
                arrayList.add(kVar);
                i35 = i55;
                i22 = i44;
                i25 = i43;
                i26 = i45;
                i28 = i48;
                i33 = i53;
                i20 = i38;
                i10 = i39;
                i34 = i54;
                i32 = i52;
                i21 = i42;
                i19 = i46;
                i29 = i49;
                i11 = i40;
                i30 = i50;
                i18 = i37;
            }
            P.close();
            tVar.release();
            ArrayList k11 = n10.k();
            ArrayList g10 = n10.g();
            boolean isEmpty = arrayList.isEmpty();
            String str = f2615b;
            if (!isEmpty) {
                i24 = 0;
                u.w().z(str, "Recently completed work:\n\n", new Throwable[0]);
                cVar = k10;
                cVar2 = l10;
                cVar3 = o10;
                u.w().z(str, b(cVar2, cVar3, cVar, arrayList), new Throwable[0]);
            } else {
                cVar = k10;
                cVar2 = l10;
                cVar3 = o10;
                i24 = 0;
            }
            if (!k11.isEmpty()) {
                u.w().z(str, "Running work:\n\n", new Throwable[i24]);
                u.w().z(str, b(cVar2, cVar3, cVar, k11), new Throwable[i24]);
            }
            if (!g10.isEmpty()) {
                u.w().z(str, "Enqueued work:\n\n", new Throwable[i24]);
                u.w().z(str, b(cVar2, cVar3, cVar, g10), new Throwable[i24]);
            }
            return new androidx.work.s(androidx.work.k.f2621c);
        } catch (Throwable th3) {
            th = th3;
            P.close();
            tVar.release();
            throw th;
        }
    }
}
