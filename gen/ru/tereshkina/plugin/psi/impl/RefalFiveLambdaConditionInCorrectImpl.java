// This is a generated file. Not intended for manual editing.
package ru.tereshkina.plugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static ru.tereshkina.plugin.psi.RefalFiveLambdaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import ru.tereshkina.plugin.psi.*;

public class RefalFiveLambdaConditionInCorrectImpl extends ASTWrapperPsiElement implements RefalFiveLambdaConditionInCorrect {

  public RefalFiveLambdaConditionInCorrectImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RefalFiveLambdaVisitor visitor) {
    visitor.visitConditionInCorrect(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RefalFiveLambdaVisitor) accept((RefalFiveLambdaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public RefalFiveLambdaPattern getPattern() {
    return findNotNullChildByClass(RefalFiveLambdaPattern.class);
  }

  @Override
  @NotNull
  public RefalFiveLambdaResultEx getResultEx() {
    return findNotNullChildByClass(RefalFiveLambdaResultEx.class);
  }

}
