package com.google.android.gms.appindexing;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Iterator;
import java.util.List;

@VisibleForTesting
@Deprecated
/* loaded from: classes2.dex */
public final class AndroidAppUri {
    private final Uri zza;

    private AndroidAppUri(Uri uri) {
        this.zza = uri;
    }

    @NonNull
    @VisibleForTesting
    @Deprecated
    public static AndroidAppUri newAndroidAppUri(@NonNull Uri uri) {
        AndroidAppUri androidAppUri = new AndroidAppUri(uri);
        if ("android-app".equals(androidAppUri.zza.getScheme())) {
            if (!TextUtils.isEmpty(androidAppUri.getPackageName())) {
                if (androidAppUri.zza.equals(newAndroidAppUri(androidAppUri.getPackageName(), androidAppUri.getDeepLinkUri()).toUri())) {
                    return androidAppUri;
                }
                throw new IllegalArgumentException("URI is not canonical.");
            }
            throw new IllegalArgumentException("Package name is empty.");
        }
        throw new IllegalArgumentException("android-app scheme is required.");
    }

    public boolean equals(Object obj) {
        if (obj instanceof AndroidAppUri) {
            return this.zza.equals(((AndroidAppUri) obj).zza);
        }
        return false;
    }

    @VisibleForTesting
    public Uri getDeepLinkUri() {
        List<String> pathSegments = this.zza.getPathSegments();
        if (pathSegments.size() > 0) {
            String str = pathSegments.get(0);
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(str);
            if (pathSegments.size() > 1) {
                builder.authority(pathSegments.get(1));
                for (int i10 = 2; i10 < pathSegments.size(); i10++) {
                    builder.appendPath(pathSegments.get(i10));
                }
            }
            builder.encodedQuery(this.zza.getEncodedQuery());
            builder.encodedFragment(this.zza.getEncodedFragment());
            return builder.build();
        }
        return null;
    }

    @VisibleForTesting
    public String getPackageName() {
        return this.zza.getAuthority();
    }

    public int hashCode() {
        return Objects.hashCode(this.zza);
    }

    @NonNull
    public String toString() {
        return this.zza.toString();
    }

    @NonNull
    @VisibleForTesting
    public Uri toUri() {
        return this.zza;
    }

    @NonNull
    @VisibleForTesting
    @Deprecated
    public static AndroidAppUri newAndroidAppUri(String str, Uri uri) {
        Uri.Builder authority = new Uri.Builder().scheme("android-app").authority(str);
        if (uri != null) {
            String scheme = uri.getScheme();
            if (scheme != null) {
                authority.appendPath(scheme);
            }
            String authority2 = uri.getAuthority();
            if (authority2 != null) {
                authority.appendPath(authority2);
            }
            Iterator<String> it = uri.getPathSegments().iterator();
            while (it.hasNext()) {
                authority.appendPath(it.next());
            }
            authority.encodedQuery(uri.getEncodedQuery()).encodedFragment(uri.getEncodedFragment());
        }
        return new AndroidAppUri(authority.build());
    }
}
