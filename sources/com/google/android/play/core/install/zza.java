package com.google.android.play.core.install;

import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes2.dex */
public final class zza {

    /* renamed from: a, reason: collision with root package name */
    public final int f11575a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11576b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11577c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11578d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11579e;

    public zza(int i10, long j10, long j11, int i11, String str) {
        this.f11575a = i10;
        this.f11576b = j10;
        this.f11577c = j11;
        this.f11578d = i11;
        if (str != null) {
            this.f11579e = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zza) {
            zza zzaVar = (zza) obj;
            if (this.f11575a == zzaVar.f11575a && this.f11576b == zzaVar.f11576b && this.f11577c == zzaVar.f11577c && this.f11578d == zzaVar.f11578d && this.f11579e.equals(zzaVar.f11579e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f11575a ^ 1000003;
        long j10 = this.f11576b;
        long j11 = this.f11577c;
        return (((((((i10 * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f11578d) * 1000003) ^ this.f11579e.hashCode();
    }

    public final String toString() {
        return "InstallState{installStatus=" + this.f11575a + ", bytesDownloaded=" + this.f11576b + ", totalBytesToDownload=" + this.f11577c + ", installErrorCode=" + this.f11578d + ", packageName=" + this.f11579e + UrlTreeKt.componentParamSuffix;
    }
}
