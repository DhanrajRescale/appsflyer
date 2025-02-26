package com.google.android.gms.dynamic;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.LifecycleDelegate;
import java.util.LinkedList;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class DeferredLifecycleHelper<T extends LifecycleDelegate> {
    private T zaa;
    private Bundle zab;
    private LinkedList<zah> zac;
    private final OnDelegateCreatedListener<T> zad = new zaa(this);

    @KeepForSdk
    public DeferredLifecycleHelper() {
    }

    @KeepForSdk
    public static void showGooglePlayUnavailableMessage(@NonNull FrameLayout frameLayout) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        Context context = frameLayout.getContext();
        int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(context);
        String zad = com.google.android.gms.common.internal.zac.zad(context, isGooglePlayServicesAvailable);
        String zac = com.google.android.gms.common.internal.zac.zac(context, isGooglePlayServicesAvailable);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(zad);
        linearLayout.addView(textView);
        Intent errorResolutionIntent = googleApiAvailability.getErrorResolutionIntent(context, isGooglePlayServicesAvailable, null);
        if (errorResolutionIntent != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(zac);
            linearLayout.addView(button);
            button.setOnClickListener(new zae(context, errorResolutionIntent));
        }
    }

    private final void zae(int i10) {
        while (!this.zac.isEmpty() && this.zac.getLast().zaa() >= i10) {
            this.zac.removeLast();
        }
    }

    private final void zaf(Bundle bundle, zah zahVar) {
        T t10 = this.zaa;
        if (t10 != null) {
            zahVar.zab(t10);
            return;
        }
        if (this.zac == null) {
            this.zac = new LinkedList<>();
        }
        this.zac.add(zahVar);
        if (bundle != null) {
            Bundle bundle2 = this.zab;
            if (bundle2 == null) {
                this.zab = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        createDelegate(this.zad);
    }

    @KeepForSdk
    public abstract void createDelegate(@NonNull OnDelegateCreatedListener<T> onDelegateCreatedListener);

    @NonNull
    @KeepForSdk
    public T getDelegate() {
        return this.zaa;
    }

    @KeepForSdk
    public void handleGooglePlayUnavailable(@NonNull FrameLayout frameLayout) {
        showGooglePlayUnavailableMessage(frameLayout);
    }

    @KeepForSdk
    public void onCreate(Bundle bundle) {
        zaf(bundle, new zac(this, bundle));
    }

    @NonNull
    @KeepForSdk
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        zaf(bundle, new zad(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.zaa == null) {
            handleGooglePlayUnavailable(frameLayout);
        }
        return frameLayout;
    }

    @KeepForSdk
    public void onDestroy() {
        T t10 = this.zaa;
        if (t10 != null) {
            t10.onDestroy();
        } else {
            zae(1);
        }
    }

    @KeepForSdk
    public void onDestroyView() {
        T t10 = this.zaa;
        if (t10 != null) {
            t10.onDestroyView();
        } else {
            zae(2);
        }
    }

    @KeepForSdk
    public void onInflate(@NonNull Activity activity, @NonNull Bundle bundle, Bundle bundle2) {
        zaf(bundle2, new zab(this, activity, bundle, bundle2));
    }

    @KeepForSdk
    public void onLowMemory() {
        T t10 = this.zaa;
        if (t10 != null) {
            t10.onLowMemory();
        }
    }

    @KeepForSdk
    public void onPause() {
        T t10 = this.zaa;
        if (t10 != null) {
            t10.onPause();
        } else {
            zae(5);
        }
    }

    @KeepForSdk
    public void onResume() {
        zaf(null, new zag(this));
    }

    @KeepForSdk
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        T t10 = this.zaa;
        if (t10 != null) {
            t10.onSaveInstanceState(bundle);
            return;
        }
        Bundle bundle2 = this.zab;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    @KeepForSdk
    public void onStart() {
        zaf(null, new zaf(this));
    }

    @KeepForSdk
    public void onStop() {
        T t10 = this.zaa;
        if (t10 != null) {
            t10.onStop();
        } else {
            zae(4);
        }
    }
}
