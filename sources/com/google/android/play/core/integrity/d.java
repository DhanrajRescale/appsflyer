package com.google.android.play.core.integrity;

/* loaded from: classes2.dex */
final class d extends w {

    /* renamed from: a, reason: collision with root package name */
    private String f11585a;

    @Override // com.google.android.play.core.integrity.w
    public final w a(String str) {
        this.f11585a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.w
    public final IntegrityTokenResponse b() {
        String str = this.f11585a;
        if (str != null) {
            return new f(str, null);
        }
        throw new IllegalStateException("Missing required properties: token");
    }
}
