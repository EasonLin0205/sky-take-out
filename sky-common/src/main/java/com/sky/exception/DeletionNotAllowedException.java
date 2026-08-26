package com.sky.exception;

public class DeletionNotAllowedException extends BaseException {
    // 分类下还有菜品，不能删除分类
    public static final String CATEGORY_HAS_DISHES = "分类下还有菜品,不能删除分类";
    // 分类与套餐关联，不能删除分类
    public static final String CATEGORY_HAS_SETMEALS = "分类与套餐关联,不能删除分类";

    public DeletionNotAllowedException(String msg) {
        super(msg);
    }

}
