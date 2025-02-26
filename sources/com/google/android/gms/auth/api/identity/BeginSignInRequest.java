package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "BeginSignInRequestCreator")
/* loaded from: classes2.dex */
public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new zzc();

    @SafeParcelable.Field(getter = "getPasswordRequestOptions", id = 1)
    private final PasswordRequestOptions zzas;

    @SafeParcelable.Field(getter = "getGoogleIdTokenRequestOptions", id = 2)
    private final GoogleIdTokenRequestOptions zzat;

    @SafeParcelable.Field(getter = "getSessionId", id = 3)
    private final String zzau;

    @SafeParcelable.Field(getter = "isAutoSelectEnabled", id = 4)
    private final boolean zzav;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private PasswordRequestOptions zzas = PasswordRequestOptions.builder().setSupported(false).build();
        private GoogleIdTokenRequestOptions zzat = GoogleIdTokenRequestOptions.builder().setSupported(false).build();
        private String zzau;
        private boolean zzav;

        public final BeginSignInRequest build() {
            return new BeginSignInRequest(this.zzas, this.zzat, this.zzau, this.zzav);
        }

        public final Builder setAutoSelectEnabled(boolean z10) {
            this.zzav = z10;
            return this;
        }

        public final Builder setGoogleIdTokenRequestOptions(@NonNull GoogleIdTokenRequestOptions googleIdTokenRequestOptions) {
            this.zzat = (GoogleIdTokenRequestOptions) Preconditions.checkNotNull(googleIdTokenRequestOptions);
            return this;
        }

        public final Builder setPasswordRequestOptions(@NonNull PasswordRequestOptions passwordRequestOptions) {
            this.zzas = (PasswordRequestOptions) Preconditions.checkNotNull(passwordRequestOptions);
            return this;
        }

        public final Builder zzd(@NonNull String str) {
            this.zzau = str;
            return this;
        }
    }

    @SafeParcelable.Class(creator = "GoogleIdTokenRequestOptionsCreator")
    /* loaded from: classes2.dex */
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new zzh();

        @SafeParcelable.Field(getter = "isSupported", id = 1)
        private final boolean zzaw;

        @SafeParcelable.Field(getter = "getServerClientId", id = 2)
        private final String zzax;

        @SafeParcelable.Field(getter = "getNonce", id = 3)
        private final String zzay;

        @SafeParcelable.Field(getter = "filterByAuthorizedAccounts", id = 4)
        private final boolean zzaz;

        @SafeParcelable.Field(getter = "getLinkedServiceId", id = 5)
        private final String zzba;

        @SafeParcelable.Field(getter = "getIdTokenDepositionScopes", id = 6)
        private final List<String> zzbb;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private boolean zzaw = false;
            private String zzax = null;
            private String zzay = null;
            private boolean zzaz = true;
            private String zzba = null;
            private List<String> zzbb = null;

            public final GoogleIdTokenRequestOptions build() {
                return new GoogleIdTokenRequestOptions(this.zzaw, this.zzax, this.zzay, this.zzaz, null, null);
            }

            public final Builder setFilterByAuthorizedAccounts(boolean z10) {
                this.zzaz = z10;
                return this;
            }

            public final Builder setNonce(String str) {
                this.zzay = str;
                return this;
            }

            public final Builder setServerClientId(@NonNull String str) {
                this.zzax = Preconditions.checkNotEmpty(str);
                return this;
            }

            public final Builder setSupported(boolean z10) {
                this.zzaw = z10;
                return this;
            }
        }

        @SafeParcelable.Constructor
        public GoogleIdTokenRequestOptions(@SafeParcelable.Param(id = 1) boolean z10, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) boolean z11, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) List<String> list) {
            this.zzaw = z10;
            if (z10) {
                Preconditions.checkNotNull(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.zzax = str;
            this.zzay = str2;
            this.zzaz = z11;
            this.zzbb = BeginSignInRequest.zzc(list);
            this.zzba = str3;
        }

        public static Builder builder() {
            return new Builder();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            if (this.zzaw != googleIdTokenRequestOptions.zzaw || !Objects.equal(this.zzax, googleIdTokenRequestOptions.zzax) || !Objects.equal(this.zzay, googleIdTokenRequestOptions.zzay) || this.zzaz != googleIdTokenRequestOptions.zzaz || !Objects.equal(this.zzba, googleIdTokenRequestOptions.zzba) || !Objects.equal(this.zzbb, googleIdTokenRequestOptions.zzbb)) {
                return false;
            }
            return true;
        }

        public final boolean filterByAuthorizedAccounts() {
            return this.zzaz;
        }

        public final String getNonce() {
            return this.zzay;
        }

        public final String getServerClientId() {
            return this.zzax;
        }

        public final int hashCode() {
            return Objects.hashCode(Boolean.valueOf(this.zzaw), this.zzax, this.zzay, Boolean.valueOf(this.zzaz), this.zzba, this.zzbb);
        }

        public final boolean isSupported() {
            return this.zzaw;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, isSupported());
            SafeParcelWriter.writeString(parcel, 2, getServerClientId(), false);
            SafeParcelWriter.writeString(parcel, 3, getNonce(), false);
            SafeParcelWriter.writeBoolean(parcel, 4, filterByAuthorizedAccounts());
            SafeParcelWriter.writeString(parcel, 5, this.zzba, false);
            SafeParcelWriter.writeStringList(parcel, 6, this.zzbb, false);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }
    }

    @SafeParcelable.Class(creator = "PasswordRequestOptionsCreator")
    /* loaded from: classes2.dex */
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new zzi();

        @SafeParcelable.Field(getter = "isSupported", id = 1)
        private final boolean zzaw;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private boolean zzaw = false;

            public final PasswordRequestOptions build() {
                return new PasswordRequestOptions(this.zzaw);
            }

            public final Builder setSupported(boolean z10) {
                this.zzaw = z10;
                return this;
            }
        }

        @SafeParcelable.Constructor
        public PasswordRequestOptions(@SafeParcelable.Param(id = 1) boolean z10) {
            this.zzaw = z10;
        }

        public static Builder builder() {
            return new Builder();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof PasswordRequestOptions) || this.zzaw != ((PasswordRequestOptions) obj).zzaw) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Objects.hashCode(Boolean.valueOf(this.zzaw));
        }

        public final boolean isSupported() {
            return this.zzaw;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, isSupported());
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }
    }

    @SafeParcelable.Constructor
    public BeginSignInRequest(@SafeParcelable.Param(id = 1) PasswordRequestOptions passwordRequestOptions, @SafeParcelable.Param(id = 2) GoogleIdTokenRequestOptions googleIdTokenRequestOptions, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) boolean z10) {
        this.zzas = (PasswordRequestOptions) Preconditions.checkNotNull(passwordRequestOptions);
        this.zzat = (GoogleIdTokenRequestOptions) Preconditions.checkNotNull(googleIdTokenRequestOptions);
        this.zzau = str;
        this.zzav = z10;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder zzc(BeginSignInRequest beginSignInRequest) {
        Preconditions.checkNotNull(beginSignInRequest);
        Builder autoSelectEnabled = builder().setGoogleIdTokenRequestOptions(beginSignInRequest.getGoogleIdTokenRequestOptions()).setPasswordRequestOptions(beginSignInRequest.getPasswordRequestOptions()).setAutoSelectEnabled(beginSignInRequest.zzav);
        String str = beginSignInRequest.zzau;
        if (str != null) {
            autoSelectEnabled.zzd(str);
        }
        return autoSelectEnabled;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        if (!Objects.equal(this.zzas, beginSignInRequest.zzas) || !Objects.equal(this.zzat, beginSignInRequest.zzat) || !Objects.equal(this.zzau, beginSignInRequest.zzau) || this.zzav != beginSignInRequest.zzav) {
            return false;
        }
        return true;
    }

    public final GoogleIdTokenRequestOptions getGoogleIdTokenRequestOptions() {
        return this.zzat;
    }

    public final PasswordRequestOptions getPasswordRequestOptions() {
        return this.zzas;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzas, this.zzat, this.zzau, Boolean.valueOf(this.zzav));
    }

    public final boolean isAutoSelectEnabled() {
        return this.zzav;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getPasswordRequestOptions(), i10, false);
        SafeParcelWriter.writeParcelable(parcel, 2, getGoogleIdTokenRequestOptions(), i10, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzau, false);
        SafeParcelWriter.writeBoolean(parcel, 4, isAutoSelectEnabled());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<String> zzc(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        return arrayList;
    }
}
