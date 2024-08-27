package com.google.android.gms.auth.api.identity;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public final class zzl implements Api.ApiOptions.Optional {
    private final String zzau;

    /* loaded from: classes2.dex */
    public static class zzc {
        private String zzau;

        private zzc() {
        }

        public static zzc zzc(zzl zzlVar) {
            zzc zzcVar = new zzc();
            String zzh = zzlVar.zzh();
            if (zzh != null) {
                zzcVar.zzh(zzh);
            }
            return zzcVar;
        }

        public final zzc zzh(@NonNull String str) {
            this.zzau = Preconditions.checkNotEmpty(str);
            return this;
        }

        public final zzl zzk() {
            return new zzl(this.zzau);
        }
    }

    public zzl(String str) {
        this.zzau = str;
    }

    public static zzc zzj() {
        return new zzc();
    }

    public final boolean equals(Object obj) {
        return obj instanceof zzl;
    }

    public final int hashCode() {
        return Objects.hashCode(zzl.class);
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
