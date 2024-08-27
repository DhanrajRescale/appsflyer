package com.webengage.sdk.android.actions.database;

import android.content.Context;
import com.webengage.sdk.android.WebEngage;
import com.webengage.sdk.android.utils.WebEngageConstant;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    r f12295a;

    /* renamed from: c, reason: collision with root package name */
    private Context f12297c;

    /* renamed from: b, reason: collision with root package name */
    private int f12296b = 5;

    /* renamed from: d, reason: collision with root package name */
    private e f12298d = null;

    /* renamed from: e, reason: collision with root package name */
    private m f12299e = null;

    /* renamed from: f, reason: collision with root package name */
    private j f12300f = null;

    public t(r rVar, Context context) {
        this.f12295a = rVar;
        this.f12297c = context;
    }

    private int a(com.webengage.sdk.android.n nVar) {
        if (nVar == null) {
            return 1;
        }
        if ("application".equals(nVar.b())) {
            return (nVar.f() == null || !((Boolean) nVar.f().get("high_reporting_priority")).booleanValue()) ? 1 : 2;
        }
        Integer num = WebEngageConstant.f12693d.get(nVar.d());
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    private ReportingStrategy b() {
        return WebEngage.get().getWebEngageConfig().getEventReportingStrategy();
    }

    private m d() {
        if (this.f12299e == null) {
            this.f12299e = new m(this.f12297c);
        }
        return this.f12299e;
    }

    public j c() {
        if (this.f12300f == null) {
            this.f12300f = new j(this.f12297c, d());
        }
        return this.f12300f;
    }

    public r e() {
        return this.f12295a;
    }

    private e a() {
        if (this.f12298d == null) {
            this.f12298d = new e(this.f12297c);
        }
        return this.f12298d;
    }

    public s b(com.webengage.sdk.android.n nVar) {
        return a(a(nVar));
    }

    private s a(int i10) {
        return (this.f12295a.a() || this.f12295a.b() <= this.f12296b) ? (i10 >= 2 || b() == ReportingStrategy.FORCE_SYNC) ? new c(a(), c()) : new d(a(), d(), this.f12297c) : a();
    }
}
