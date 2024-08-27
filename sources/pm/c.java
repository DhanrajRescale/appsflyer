package pm;

import android.graphics.Canvas;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.github.clans.fab.FloatingActionButton;

/* loaded from: classes.dex */
public final class c extends ShapeDrawable {

    /* renamed from: a, reason: collision with root package name */
    public final int f31169a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31170b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FloatingActionButton f31171c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FloatingActionButton floatingActionButton, OvalShape ovalShape) {
        super(ovalShape);
        int i10;
        this.f31171c = floatingActionButton;
        int i11 = 0;
        if (floatingActionButton.f()) {
            i10 = Math.abs(floatingActionButton.f10980e) + floatingActionButton.f10979d;
        } else {
            i10 = 0;
        }
        this.f31169a = i10;
        if (floatingActionButton.f()) {
            i11 = Math.abs(floatingActionButton.f10982f) + floatingActionButton.f10979d;
        }
        this.f31170b = i11;
        if (floatingActionButton.f11005t) {
            int i12 = floatingActionButton.f11006u;
            this.f31169a = i10 + i12;
            this.f31170b = i11 + i12;
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        PorterDuffXfermode porterDuffXfermode = FloatingActionButton.f10975p0;
        FloatingActionButton floatingActionButton = this.f31171c;
        int c10 = floatingActionButton.c();
        int i10 = this.f31169a;
        int b10 = floatingActionButton.b();
        int i11 = this.f31170b;
        setBounds(i10, i11, c10 - i10, b10 - i11);
        super.draw(canvas);
    }
}
