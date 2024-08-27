package in.juspay.hypersdk.mystique;

import android.widget.AbsListView;
import in.juspay.hypersdk.core.DuiCallback;

/* loaded from: classes2.dex */
public class OnScroll implements AbsListView.OnScrollListener {
    private final DuiCallback duiCallback;
    private String scrollCallback;
    private String scrollChangeCallback;

    public OnScroll(DuiCallback duiCallback) {
        this.duiCallback = duiCallback;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        this.duiCallback.addJsToWebView("window.callUICallback('" + this.scrollCallback + "','" + i10 + "," + i11 + "," + i12 + "');");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i10) {
        this.duiCallback.addJsToWebView("window.callUICallback('" + this.scrollChangeCallback + "'," + i10 + ");");
    }

    public void setScrollCallback(String str) {
        this.scrollCallback = str;
    }

    public void setScrollChangeCallback(String str) {
        this.scrollChangeCallback = str;
    }
}
