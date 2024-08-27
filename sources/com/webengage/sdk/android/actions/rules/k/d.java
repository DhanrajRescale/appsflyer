package com.webengage.sdk.android.actions.rules.k;

import com.webengage.sdk.android.actions.database.DataHolder;
import java.util.List;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private String f12512a;

    /* renamed from: b, reason: collision with root package name */
    private List<String> f12513b;

    public d(String str) {
        this.f12513b = null;
        this.f12512a = str;
        this.f12513b = c.a().a(this.f12512a, DataHolder.get().H());
    }

    public Object a() {
        boolean H = DataHolder.get().H();
        if (this.f12513b == null) {
            this.f12513b = c.a().a(this.f12512a, H);
        }
        try {
            return c.a().a(this.f12513b, H);
        } catch (Exception unused) {
            return null;
        }
    }

    public String toString() {
        return this.f12512a;
    }

    public d(List<String> list) {
        this.f12512a = null;
        this.f12513b = list;
    }
}
