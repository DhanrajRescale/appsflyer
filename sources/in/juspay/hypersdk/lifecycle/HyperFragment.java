package in.juspay.hypersdk.lifecycle;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.g0;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes2.dex */
public class HyperFragment extends g0 {

    @NonNull
    private final LinkedList<EventListener> onPauseListeners = new LinkedList<>();

    @NonNull
    private final LinkedList<EventListener> onStopListeners = new LinkedList<>();

    @NonNull
    private final LinkedList<EventListener> onResumeListeners = new LinkedList<>();

    @NonNull
    private final LinkedList<EventListener> onDestroyListeners = new LinkedList<>();

    @NonNull
    private final LinkedList<EventListener> onSaveInstanceListeners = new LinkedList<>();

    @NonNull
    private final LinkedList<EventListener> onAttachListeners = new LinkedList<>();

    @NonNull
    private final LinkedList<ActivityResultHolder> onActivityResultListeners = new LinkedList<>();

    @NonNull
    private final LinkedList<RequestPermissionResult> onRequestPermissionsResultListeners = new LinkedList<>();

    /* renamed from: in.juspay.hypersdk.lifecycle.HyperFragment$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$in$juspay$hypersdk$lifecycle$FragmentEvent;

        static {
            int[] iArr = new int[FragmentEvent.values().length];
            $SwitchMap$in$juspay$hypersdk$lifecycle$FragmentEvent = iArr;
            try {
                iArr[FragmentEvent.onPause.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$in$juspay$hypersdk$lifecycle$FragmentEvent[FragmentEvent.onResume.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$in$juspay$hypersdk$lifecycle$FragmentEvent[FragmentEvent.onStop.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$in$juspay$hypersdk$lifecycle$FragmentEvent[FragmentEvent.onDestroy.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$in$juspay$hypersdk$lifecycle$FragmentEvent[FragmentEvent.OnSavedStateInstance.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$in$juspay$hypersdk$lifecycle$FragmentEvent[FragmentEvent.onAttach.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$in$juspay$hypersdk$lifecycle$FragmentEvent[FragmentEvent.onActivityResult.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$in$juspay$hypersdk$lifecycle$FragmentEvent[FragmentEvent.onRequestPermissionResult.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    @Override // androidx.fragment.app.g0
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Iterator<ActivityResultHolder> it = this.onActivityResultListeners.iterator();
        while (it.hasNext()) {
            it.next().onActivityResult(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.g0
    public void onAttach(Context context) {
        super.onAttach(context);
        Iterator<EventListener> it = this.onAttachListeners.iterator();
        while (it.hasNext()) {
            it.next().onEvent("{}");
        }
    }

    @Override // androidx.fragment.app.g0
    public void onDestroy() {
        super.onDestroy();
        Iterator<EventListener> it = this.onDestroyListeners.iterator();
        while (it.hasNext()) {
            it.next().onEvent("{}");
        }
        for (FragmentEvent fragmentEvent : FragmentEvent.values()) {
            unRegisterForEvent(fragmentEvent);
        }
    }

    @Override // androidx.fragment.app.g0
    public void onPause() {
        super.onPause();
        Iterator<EventListener> it = this.onPauseListeners.iterator();
        while (it.hasNext()) {
            it.next().onEvent("{}");
        }
    }

    @Override // androidx.fragment.app.g0
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        Iterator<RequestPermissionResult> it = this.onRequestPermissionsResultListeners.iterator();
        while (it.hasNext()) {
            it.next().onRequestPermissionsResult(i10, strArr, iArr);
        }
    }

    @Override // androidx.fragment.app.g0
    public void onResume() {
        super.onResume();
        Iterator<EventListener> it = this.onResumeListeners.iterator();
        while (it.hasNext()) {
            it.next().onEvent("{}");
        }
    }

    @Override // androidx.fragment.app.g0
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        Iterator<EventListener> it = this.onSaveInstanceListeners.iterator();
        while (it.hasNext()) {
            it.next().onEvent("{}");
        }
    }

    @Override // androidx.fragment.app.g0
    public void onStop() {
        super.onStop();
        Iterator<EventListener> it = this.onStopListeners.iterator();
        while (it.hasNext()) {
            it.next().onEvent("{}");
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    public void registerForEvent(FragmentEvent fragmentEvent, EventListener eventListener) {
        LinkedList<EventListener> linkedList;
        switch (AnonymousClass1.$SwitchMap$in$juspay$hypersdk$lifecycle$FragmentEvent[fragmentEvent.ordinal()]) {
            case 1:
                linkedList = this.onPauseListeners;
                linkedList.add(eventListener);
                return;
            case 2:
                linkedList = this.onResumeListeners;
                linkedList.add(eventListener);
                return;
            case 3:
                linkedList = this.onStopListeners;
                linkedList.add(eventListener);
                return;
            case 4:
                linkedList = this.onDestroyListeners;
                linkedList.add(eventListener);
                return;
            case 5:
                linkedList = this.onSaveInstanceListeners;
                linkedList.add(eventListener);
                return;
            case 6:
                linkedList = this.onAttachListeners;
                linkedList.add(eventListener);
                return;
            default:
                return;
        }
    }

    public void registerOnActivityResult(ActivityResultHolder activityResultHolder) {
        this.onActivityResultListeners.add(activityResultHolder);
    }

    public void registerOnRequestPermissionResult(RequestPermissionResult requestPermissionResult) {
        this.onRequestPermissionsResultListeners.add(requestPermissionResult);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    public void unRegisterForEvent(FragmentEvent fragmentEvent) {
        LinkedList linkedList;
        switch (AnonymousClass1.$SwitchMap$in$juspay$hypersdk$lifecycle$FragmentEvent[fragmentEvent.ordinal()]) {
            case 1:
                linkedList = this.onPauseListeners;
                linkedList.clear();
                return;
            case 2:
                linkedList = this.onResumeListeners;
                linkedList.clear();
                return;
            case 3:
                linkedList = this.onStopListeners;
                linkedList.clear();
                return;
            case 4:
                linkedList = this.onDestroyListeners;
                linkedList.clear();
                return;
            case 5:
                linkedList = this.onSaveInstanceListeners;
                linkedList.clear();
                return;
            case 6:
                linkedList = this.onAttachListeners;
                linkedList.clear();
                return;
            case 7:
                linkedList = this.onActivityResultListeners;
                linkedList.clear();
                return;
            case 8:
                linkedList = this.onRequestPermissionsResultListeners;
                linkedList.clear();
                return;
            default:
                return;
        }
    }
}
