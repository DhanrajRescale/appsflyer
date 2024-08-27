package com.google.android.gms.auth.api.identity;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public class zzf implements Api.ApiOptions.Optional {
    private final String zzau;

    /* loaded from: classes2.dex */
    public static class zzc {
        private String zzau;

        private zzc() {
        }

        public static zzc zzc(zzf zzfVar) {
            zzc zzcVar = new zzc();
            String zzh = zzfVar.zzh();
            if (zzh != null) {
                zzcVar.zze(zzh);
            }
            return zzcVar;
        }

        public final zzc zze(@NonNull String str) {
            this.zzau = Preconditions.checkNotEmpty(str);
            return this;
        }

        public final zzf zzi() {
            return new zzf(this.zzau);
        }
    }

    public zzf(String str) {
        this.zzau = str;
    }

    public static zzc zzg() {
        return new zzc();
    }

    public boolean equals(Object obj) {
        return obj instanceof zzf;
    }

    public int hashCode() {
        return Objects.hashCode(zzf.class);
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString("session_id", this.zzau);
        return bundle;
    }

    public final String zzh() {
        return this.zzau;
    }
}
