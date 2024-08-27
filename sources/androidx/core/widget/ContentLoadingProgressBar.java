package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.core.widget.ContentLoadingProgressBar;
import h4.d;

/* loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1514c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final d f1515a;

    /* renamed from: b, reason: collision with root package name */
    public final d f1516b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [h4.d] */
    /* JADX WARN: Type inference failed for: r2v2, types: [h4.d] */
    public ContentLoadingProgressBar(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        final int i10 = 0;
        this.f1515a = new Runnable(this) { // from class: h4.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContentLoadingProgressBar f17960b;

            {
                this.f17960b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i11 = i10;
                ContentLoadingProgressBar contentLoadingProgressBar = this.f17960b;
                switch (i11) {
                    case 0:
                        int i12 = ContentLoadingProgressBar.f1514c;
                        contentLoadingProgressBar.setVisibility(8);
                        return;
                    default:
                        int i13 = ContentLoadingProgressBar.f1514c;
                        contentLoadingProgressBar.getClass();
                        System.currentTimeMillis();
                        contentLoadingProgressBar.setVisibility(0);
                        return;
                }
            }
        };
        final int i11 = 1;
        this.f1516b = new Runnable(this) { // from class: h4.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContentLoadingProgressBar f17960b;

            {
                this.f17960b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i11;
                ContentLoadingProgressBar contentLoadingProgressBar = this.f17960b;
                switch (i112) {
                    case 0:
                        int i12 = ContentLoadingProgressBar.f1514c;
                        contentLoadingProgressBar.setVisibility(8);
                        return;
                    default:
                        int i13 = ContentLoadingProgressBar.f1514c;
                        contentLoadingProgressBar.getClass();
                        System.currentTimeMillis();
                        contentLoadingProgressBar.setVisibility(0);
                        return;
                }
            }
        };
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f1515a);
        removeCallbacks(this.f1516b);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1515a);
        removeCallbacks(this.f1516b);
    }
}
