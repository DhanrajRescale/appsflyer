package in.juspay.hypersdk.mystique;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import ao.b;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import in.juspay.hypersdk.core.DuiCallback;
import java.util.ArrayList;
import o3.e;

@Keep
/* loaded from: classes2.dex */
public class BottomSheetLayout extends FrameLayout {
    private final BottomSheetBehavior bottomSheetBehavior;
    private final BottomSheetCallback bottomSheetCallback;
    private boolean enableShift;

    /* loaded from: classes2.dex */
    public class BottomSheetCallback extends b {
        float bottomShift;
        private DuiCallback duiCallback;
        private float lastReceivedScroll;
        private String stateChangeCallback;
        private String stateSlideCallback;
        float topShift;
        boolean topShiftOverridden = false;
        boolean bottomShiftOverridden = false;

        public BottomSheetCallback() {
        }

        @Override // ao.b
        public void onSlide(@NonNull View view, float f10) {
            this.lastReceivedScroll = f10;
            DuiCallback duiCallback = this.duiCallback;
            if (duiCallback == null || this.stateSlideCallback == null) {
                return;
            }
            duiCallback.addJsToWebView("window.callUICallback('" + this.stateSlideCallback + "','" + f10 + "');");
        }

        @Override // ao.b
        public void onStateChanged(@NonNull View view, int i10) {
            int i11;
            BottomSheetBehavior bottomSheetBehavior;
            int i12;
            if (i10 == 2 && BottomSheetLayout.this.enableShift) {
                if (!this.topShiftOverridden || !this.bottomShiftOverridden) {
                    float f10 = BottomSheetLayout.this.bottomSheetBehavior.F;
                    BottomSheetBehavior bottomSheetBehavior2 = BottomSheetLayout.this.bottomSheetBehavior;
                    if (bottomSheetBehavior2.f11177f) {
                        i11 = -1;
                    } else {
                        i11 = bottomSheetBehavior2.f11176e;
                    }
                    float height = i11 / view.getHeight();
                    if (!this.topShiftOverridden) {
                        this.topShift = (f10 / 2.0f) + 0.5f;
                    }
                    if (!this.bottomShiftOverridden) {
                        this.bottomShift = (f10 / 2.0f) - (height / 2.0f);
                    }
                }
                float f11 = this.bottomShift;
                float f12 = this.lastReceivedScroll;
                if (f11 > f12) {
                    bottomSheetBehavior = BottomSheetLayout.this.bottomSheetBehavior;
                    i12 = 4;
                } else if (f12 > f11 && f12 < this.topShift) {
                    bottomSheetBehavior = BottomSheetLayout.this.bottomSheetBehavior;
                    i12 = 6;
                } else {
                    bottomSheetBehavior = BottomSheetLayout.this.bottomSheetBehavior;
                    i12 = 3;
                }
                bottomSheetBehavior.D(i12);
            }
            DuiCallback duiCallback = this.duiCallback;
            if (duiCallback != null && this.stateChangeCallback != null) {
                duiCallback.addJsToWebView("window.callUICallback('" + this.stateChangeCallback + "','" + i10 + "');");
            }
        }

        public void setBottomShift(float f10) {
            this.bottomShiftOverridden = true;
            this.bottomShift = f10;
        }

        public void setDuiCallback(DuiCallback duiCallback) {
            this.duiCallback = duiCallback;
        }

        public void setSlideCallback(String str) {
            this.stateSlideCallback = str;
        }

        public void setStateChangeCallback(String str) {
            this.stateChangeCallback = str;
        }

        public void setTopShift(float f10) {
            this.topShiftOverridden = true;
            this.topShift = f10;
        }
    }

    public BottomSheetLayout(@NonNull Context context) {
        super(context);
        this.enableShift = true;
        BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
        this.bottomSheetBehavior = bottomSheetBehavior;
        BottomSheetCallback bottomSheetCallback = new BottomSheetCallback();
        this.bottomSheetCallback = bottomSheetCallback;
        ArrayList arrayList = bottomSheetBehavior.W;
        if (!arrayList.contains(bottomSheetCallback)) {
            arrayList.add(bottomSheetCallback);
        }
    }

    @Keep
    public void setBottomShift(float f10) {
        this.bottomSheetCallback.setBottomShift(f10);
    }

    public void setEnableShift(boolean z10) {
        this.enableShift = z10;
    }

    @Keep
    public void setHalfExpandedRatio(float f10) {
        this.bottomSheetBehavior.A(f10);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            ((e) layoutParams).b(this.bottomSheetBehavior);
        }
        super.setLayoutParams(layoutParams);
    }

    @Keep
    public void setPeakHeight(int i10) {
        this.bottomSheetBehavior.C(i10);
    }

    public void setSlideCallback(DuiCallback duiCallback, String str) {
        this.bottomSheetCallback.setDuiCallback(duiCallback);
        this.bottomSheetCallback.setSlideCallback(str);
    }

    @Keep
    public void setState(int i10) {
        this.bottomSheetBehavior.D(i10);
    }

    public void setStateChangeCallback(DuiCallback duiCallback, String str) {
        this.bottomSheetCallback.setDuiCallback(duiCallback);
        this.bottomSheetCallback.setStateChangeCallback(str);
    }

    @Keep
    public void setTopShift(float f10) {
        this.bottomSheetCallback.setTopShift(f10);
    }
}
