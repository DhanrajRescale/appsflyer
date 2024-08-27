package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;

@SafeParcelable.Class(creator = "StatusCreator")
/* loaded from: classes2.dex */
public final class Status extends AbstractSafeParcelable implements Result, ReflectedParcelable {

    @SafeParcelable.VersionField(id = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT)
    final int zzb;

    @SafeParcelable.Field(getter = "getStatusCode", id = 1)
    private final int zzc;

    @SafeParcelable.Field(getter = "getStatusMessage", id = 2)
    private final String zzd;

    @SafeParcelable.Field(getter = "getPendingIntent", id = 3)
    private final PendingIntent zze;

    @SafeParcelable.Field(getter = "getConnectionResult", id = 4)
    private final ConnectionResult zzf;

    @NonNull
    @VisibleForTesting
    @ShowFirstParty
    @KeepForSdk
    public static final Status RESULT_SUCCESS_CACHE = new Status(-1);

    @NonNull
    @VisibleForTesting
    @ShowFirstParty
    @KeepForSdk
    public static final Status RESULT_SUCCESS = new Status(0);

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public static final Status RESULT_INTERRUPTED = new Status(14);

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public static final Status RESULT_INTERNAL_ERROR = new Status(8);

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public static final Status RESULT_TIMEOUT = new Status(15);

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public static final Status RESULT_CANCELED = new Status(16);

    @NonNull
    @ShowFirstParty
    public static final Status zza = new Status(17);

    @NonNull
    @KeepForSdk
    public static final Status RESULT_DEAD_CLIENT = new Status(18);

    @NonNull
    public static final Parcelable.Creator<Status> CREATOR = new zzb();

    @SafeParcelable.Constructor
    public Status(@SafeParcelable.Param(id = 1000) int i10, @SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) PendingIntent pendingIntent, @SafeParcelable.Param(id = 4) ConnectionResult connectionResult) {
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = str;
        this.zze = pendingIntent;
        this.zzf = connectionResult;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.zzb != status.zzb || this.zzc != status.zzc || !Objects.equal(this.zzd, status.zzd) || !Objects.equal(this.zze, status.zze) || !Objects.equal(this.zzf, status.zzf)) {
            return false;
        }
        return true;
    }

    public ConnectionResult getConnectionResult() {
        return this.zzf;
    }

    public PendingIntent getResolution() {
        return this.zze;
    }

    @Override // com.google.android.gms.common.api.Result
    @NonNull
    public Status getStatus() {
        return this;
    }

    public int getStatusCode() {
        return this.zzc;
    }

    public String getStatusMessage() {
        return this.zzd;
    }

    @VisibleForTesting
    public boolean hasResolution() {
        return this.zze != null;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), this.zzd, this.zze, this.zzf);
    }

    public boolean isCanceled() {
        return this.zzc == 16;
    }

    public boolean isInterrupted() {
        return this.zzc == 14;
    }

    public boolean isSuccess() {
        return this.zzc <= 0;
    }

    public void startResolutionForResult(@NonNull Activity activity, int i10) throws IntentSender.SendIntentException {
        if (!hasResolution()) {
            return;
        }
        PendingIntent pendingIntent = this.zze;
        Preconditions.checkNotNull(pendingIntent);
        activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i10, null, 0, 0, 0);
    }

    @NonNull
    public String toString() {
        Objects.ToStringHelper stringHelper = Objects.toStringHelper(this);
        stringHelper.add("statusCode", zza());
        stringHelper.add("resolution", this.zze);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getStatusCode());
        SafeParcelWriter.writeString(parcel, 2, getStatusMessage(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zze, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 4, getConnectionResult(), i10, false);
        SafeParcelWriter.writeInt(parcel, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @NonNull
    public final String zza() {
        String str = this.zzd;
        if (str != null) {
            return str;
        }
        return CommonStatusCodes.getStatusCodeString(this.zzc);
    }

    public Status(int i10) {
        this(i10, (String) null);
    }

    public Status(int i10, String str) {
        this(1, i10, str, null, null);
    }

    public Status(int i10, String str, PendingIntent pendingIntent) {
        this(1, i10, str, pendingIntent, null);
    }

    public Status(@NonNull ConnectionResult connectionResult, @NonNull String str) {
        this(connectionResult, str, 17);
    }

    @KeepForSdk
    @Deprecated
    public Status(@NonNull ConnectionResult connectionResult, @NonNull String str, int i10) {
        this(1, i10, str, connectionResult.getResolution(), connectionResult);
    }
}
