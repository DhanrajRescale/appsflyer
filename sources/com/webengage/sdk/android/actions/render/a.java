package com.webengage.sdk.android.actions.render;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

/* loaded from: classes2.dex */
public class a {
    public static Animation a(String str, Animation.AnimationListener animationListener, long j10) {
        Animation alphaAnimation;
        if ("TOP_IN".equals(str)) {
            alphaAnimation = new TranslateAnimation(2, s0.g.f34069a, 2, s0.g.f34069a, 2, -1.0f, 2, s0.g.f34069a);
        } else if ("TOP_OUT".equals(str)) {
            alphaAnimation = new TranslateAnimation(2, s0.g.f34069a, 2, s0.g.f34069a, 2, s0.g.f34069a, 2, -1.0f);
        } else if ("BOTTOM_IN".equals(str)) {
            alphaAnimation = new TranslateAnimation(2, s0.g.f34069a, 2, s0.g.f34069a, 2, 1.0f, 2, s0.g.f34069a);
        } else if ("BOTTOM_OUT".equals(str)) {
            alphaAnimation = new TranslateAnimation(2, s0.g.f34069a, 2, s0.g.f34069a, 2, s0.g.f34069a, 2, 1.0f);
        } else if ("LEFT_IN".equals(str)) {
            alphaAnimation = new TranslateAnimation(2, -1.0f, 2, s0.g.f34069a, 2, s0.g.f34069a, 2, s0.g.f34069a);
        } else if ("LEFT_OUT".equals(str)) {
            alphaAnimation = new TranslateAnimation(2, s0.g.f34069a, 2, -1.0f, 2, s0.g.f34069a, 2, s0.g.f34069a);
        } else if ("RIGHT_IN".equals(str)) {
            alphaAnimation = new TranslateAnimation(2, 1.0f, 2, s0.g.f34069a, 2, s0.g.f34069a, 2, s0.g.f34069a);
        } else if ("RIGHT_OUT".equals(str)) {
            alphaAnimation = new TranslateAnimation(2, s0.g.f34069a, 2, 1.0f, 2, s0.g.f34069a, 2, s0.g.f34069a);
        } else if ("FADE_IN".equals(str)) {
            alphaAnimation = new AlphaAnimation(s0.g.f34069a, 1.0f);
        } else {
            if (!"FADE_OUT".equals(str)) {
                return null;
            }
            alphaAnimation = new AlphaAnimation(1.0f, s0.g.f34069a);
        }
        alphaAnimation.setDuration(j10);
        alphaAnimation.setAnimationListener(animationListener);
        return alphaAnimation;
    }
}
