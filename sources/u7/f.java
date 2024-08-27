package u7;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import t.j0;

/* loaded from: classes.dex */
public final class f extends g implements Animatable {

    /* renamed from: c, reason: collision with root package name */
    public final Context f36910c;

    /* renamed from: d, reason: collision with root package name */
    public m.d f36911d = null;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f36912e = null;

    /* renamed from: f, reason: collision with root package name */
    public final i.a f36913f = new i.a(this, 1);

    /* renamed from: b, reason: collision with root package name */
    public final d f36909b = new Drawable.ConstantState();

    /* JADX WARN: Type inference failed for: r3v1, types: [android.graphics.drawable.Drawable$ConstantState, u7.d] */
    public f(Context context) {
        this.f36910c = context;
    }

    @Override // u7.g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            v3.b.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            return v3.b.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        d dVar = this.f36909b;
        dVar.f36903a.draw(canvas);
        if (dVar.f36904b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            return v3.a.a(drawable);
        }
        return this.f36909b.f36903a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f36909b.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            return v3.b.c(drawable);
        }
        return this.f36909b.f36903a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f36914a != null) {
            return new e(this.f36914a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f36909b.f36903a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f36909b.f36903a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f36909b.f36903a.getOpacity();
    }

    /* JADX WARN: Type inference failed for: r7v8, types: [t.j0, t.f] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        d dVar;
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            v3.b.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            dVar = this.f36909b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray E0 = hl.f.E0(resources, theme, attributeSet, a.f36899e);
                    int resourceId = E0.getResourceId(0, 0);
                    if (resourceId != 0) {
                        p pVar = new p();
                        ThreadLocal threadLocal = t3.p.f35324a;
                        pVar.f36914a = t3.i.a(resources, resourceId, theme);
                        new o(pVar.f36914a.getConstantState());
                        pVar.f36976f = false;
                        pVar.setCallback(this.f36913f);
                        p pVar2 = dVar.f36903a;
                        if (pVar2 != null) {
                            pVar2.setCallback(null);
                        }
                        dVar.f36903a = pVar;
                    }
                    E0.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.f36900f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f36910c;
                        if (context != null) {
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                            loadAnimator.setTarget(dVar.f36903a.f36972b.f36959b.f36957o.get(string));
                            if (dVar.f36905c == null) {
                                dVar.f36905c = new ArrayList();
                                dVar.f36906d = new j0(0);
                            }
                            dVar.f36905c.add(loadAnimator);
                            dVar.f36906d.put(loadAnimator, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (dVar.f36904b == null) {
            dVar.f36904b = new AnimatorSet();
        }
        dVar.f36904b.playTogether(dVar.f36905c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            return v3.a.d(drawable);
        }
        return this.f36909b.f36903a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f36909b.f36904b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f36909b.f36903a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f36909b.f36903a.setBounds(rect);
        }
    }

    @Override // u7.g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        return this.f36909b.f36903a.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f36909b.f36903a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f36909b.f36903a.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            v3.a.e(drawable, z10);
        } else {
            this.f36909b.f36903a.setAutoMirrored(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f36909b.f36903a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            yk.j.x1(drawable, i10);
        } else {
            this.f36909b.f36903a.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            yk.j.y1(drawable, colorStateList);
        } else {
            this.f36909b.f36903a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            yk.j.z1(drawable, mode);
        } else {
            this.f36909b.f36903a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f36909b.f36903a.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        d dVar = this.f36909b;
        if (dVar.f36904b.isStarted()) {
            return;
        }
        dVar.f36904b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f36909b.f36904b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
