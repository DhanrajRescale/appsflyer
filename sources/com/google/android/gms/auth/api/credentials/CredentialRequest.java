package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SafeParcelable.Class(creator = "CredentialRequestCreator")
/* loaded from: classes2.dex */
public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialRequest> CREATOR = new zzg();

    @SafeParcelable.Field(getter = "isPasswordLoginSupported", id = 1)
    private final boolean zzaa;

    @SafeParcelable.Field(getter = "getAccountTypes", id = 2)
    private final String[] zzab;

    @SafeParcelable.Field(getter = "getCredentialPickerConfig", id = 3)
    private final CredentialPickerConfig zzac;

    @SafeParcelable.Field(getter = "getCredentialHintPickerConfig", id = 4)
    private final CredentialPickerConfig zzad;

    @SafeParcelable.Field(getter = "isIdTokenRequested", id = 5)
    private final boolean zzae;

    @SafeParcelable.Field(getter = "getServerClientId", id = 6)
    private final String zzaf;

    @SafeParcelable.Field(getter = "getIdTokenNonce", id = 7)
    private final String zzag;

    @SafeParcelable.Field(getter = "getRequireUserMediation", id = 8)
    private final boolean zzah;

    @SafeParcelable.Field(id = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT)
    private final int zzv;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private boolean zzaa;
        private String[] zzab;
        private CredentialPickerConfig zzac;
        private CredentialPickerConfig zzad;
        private String zzag;
        private boolean zzae = false;
        private boolean zzah = false;
        private String zzaf = null;

        public final CredentialRequest build() {
            if (this.zzab == null) {
                this.zzab = new String[0];
            }
            if (!this.zzaa && this.zzab.length == 0) {
                throw new IllegalStateException("At least one authentication method must be specified");
            }
            return new CredentialRequest(this);
        }

        public final Builder setAccountTypes(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            this.zzab = strArr;
            return this;
        }

        public final Builder setCredentialHintPickerConfig(CredentialPickerConfig credentialPickerConfig) {
            this.zzad = credentialPickerConfig;
            return this;
        }

        public final Builder setCredentialPickerConfig(CredentialPickerConfig credentialPickerConfig) {
            this.zzac = credentialPickerConfig;
            return this;
        }

        public final Builder setIdTokenNonce(String str) {
            this.zzag = str;
            return this;
        }

        public final Builder setIdTokenRequested(boolean z10) {
            this.zzae = z10;
            return this;
        }

        public final Builder setPasswordLoginSupported(boolean z10) {
            this.zzaa = z10;
            return this;
        }

        public final Builder setServerClientId(String str) {
            this.zzaf = str;
            return this;
        }

        @Deprecated
        public final Builder setSupportsPasswordLogin(boolean z10) {
            return setPasswordLoginSupported(z10);
        }
    }

    @SafeParcelable.Constructor
    public CredentialRequest(@SafeParcelable.Param(id = 1000) int i10, @SafeParcelable.Param(id = 1) boolean z10, @SafeParcelable.Param(id = 2) String[] strArr, @SafeParcelable.Param(id = 3) CredentialPickerConfig credentialPickerConfig, @SafeParcelable.Param(id = 4) CredentialPickerConfig credentialPickerConfig2, @SafeParcelable.Param(id = 5) boolean z11, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) String str2, @SafeParcelable.Param(id = 8) boolean z12) {
        this.zzv = i10;
        this.zzaa = z10;
        this.zzab = (String[]) Preconditions.checkNotNull(strArr);
        this.zzac = credentialPickerConfig == null ? new CredentialPickerConfig.Builder().build() : credentialPickerConfig;
        this.zzad = credentialPickerConfig2 == null ? new CredentialPickerConfig.Builder().build() : credentialPickerConfig2;
        if (i10 < 3) {
            this.zzae = true;
            this.zzaf = null;
            this.zzag = null;
        } else {
            this.zzae = z11;
            this.zzaf = str;
            this.zzag = str2;
        }
        this.zzah = z12;
    }

    @NonNull
    public final String[] getAccountTypes() {
        return this.zzab;
    }

    @NonNull
    public final Set<String> getAccountTypesSet() {
        return new HashSet(Arrays.asList(this.zzab));
    }

    @NonNull
    public final CredentialPickerConfig getCredentialHintPickerConfig() {
        return this.zzad;
    }

    @NonNull
    public final CredentialPickerConfig getCredentialPickerConfig() {
        return this.zzac;
    }

    public final String getIdTokenNonce() {
        return this.zzag;
    }

    public final String getServerClientId() {
        return this.zzaf;
    }

    @Deprecated
    public final boolean getSupportsPasswordLogin() {
        return isPasswordLoginSupported();
    }

    public final boolean isIdTokenRequested() {
        return this.zzae;
    }

    public final boolean isPasswordLoginSupported() {
        return this.zzaa;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, isPasswordLoginSupported());
        SafeParcelWriter.writeStringArray(parcel, 2, getAccountTypes(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getCredentialPickerConfig(), i10, false);
        SafeParcelWriter.writeParcelable(parcel, 4, getCredentialHintPickerConfig(), i10, false);
        SafeParcelWriter.writeBoolean(parcel, 5, isIdTokenRequested());
        SafeParcelWriter.writeString(parcel, 6, getServerClientId(), false);
        SafeParcelWriter.writeString(parcel, 7, getIdTokenNonce(), false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzah);
        SafeParcelWriter.writeInt(parcel, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, this.zzv);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private CredentialRequest(Builder builder) {
        this(4, builder.zzaa, builder.zzab, builder.zzac, builder.zzad, builder.zzae, builder.zzaf, builder.zzag, false);
    }
}
