package com.google.android.gms.appindexing;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;

@VisibleForTesting
@Deprecated
/* loaded from: classes2.dex */
public class Thing {
    final Bundle zza;

    public Thing(Bundle bundle) {
        this.zza = bundle;
    }

    @NonNull
    public final Bundle zza() {
        return this.zza;
    }

    @VisibleForTesting
    @Deprecated
    /* loaded from: classes2.dex */
    public static class Builder {
        final Bundle zza = new Bundle();

        @NonNull
        public Thing build() {
            return new Thing(this.zza);
        }

        @NonNull
        public Builder put(@NonNull String str, @NonNull Thing thing) {
            Preconditions.checkNotNull(str);
            if (thing != null) {
                this.zza.putParcelable(str, thing.zza);
            }
            return this;
        }

        @NonNull
        public Builder setDescription(@NonNull String str) {
            put("description", str);
            return this;
        }

        @NonNull
        public Builder setId(@NonNull String str) {
            if (str != null) {
                put("id", str);
            }
            return this;
        }

        @NonNull
        public Builder setName(@NonNull String str) {
            Preconditions.checkNotNull(str);
            put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
            return this;
        }

        @NonNull
        public Builder setType(@NonNull String str) {
            put("type", str);
            return this;
        }

        @NonNull
        public Builder setUrl(@NonNull Uri uri) {
            Preconditions.checkNotNull(uri);
            put("url", uri.toString());
            return this;
        }

        @NonNull
        public Builder put(@NonNull String str, @NonNull String str2) {
            Preconditions.checkNotNull(str);
            if (str2 != null) {
                this.zza.putString(str, str2);
            }
            return this;
        }

        @NonNull
        public Builder put(@NonNull String str, boolean z10) {
            Preconditions.checkNotNull(str);
            this.zza.putBoolean(str, z10);
            return this;
        }

        @NonNull
        public Builder put(@NonNull String str, @NonNull Thing[] thingArr) {
            Preconditions.checkNotNull(str);
            if (thingArr != null) {
                ArrayList arrayList = new ArrayList();
                for (Thing thing : thingArr) {
                    if (thing != null) {
                        arrayList.add(thing.zza);
                    }
                }
                this.zza.putParcelableArray(str, (Parcelable[]) arrayList.toArray(new Bundle[arrayList.size()]));
            }
            return this;
        }

        @NonNull
        public Builder put(@NonNull String str, @NonNull String[] strArr) {
            Preconditions.checkNotNull(str);
            if (strArr != null) {
                this.zza.putStringArray(str, strArr);
            }
            return this;
        }
    }
}
